package com.inti.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.inti.model.Article;
import com.inti.model.CB;
import com.inti.model.Commande;
import com.inti.model.Paiement;
import com.inti.model.Paypal;

import com.inti.util.HibernateUtil;

@WebServlet("/CommandeServlet")
public class CommandeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger log = LogManager.getLogger();
	private Session s;
   
    public CommandeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		s = HibernateUtil.getSessionFactory().openSession();
		log.debug("Connexion à la BDD et configuration d'hibernate");
		this.getServletContext().getRequestDispatcher("/WEB-INF/commande.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try 
		{
			s.beginTransaction();
			
			log.info("Début enregistrement du paiement");
			
            Article art1 = new Article(request.getParameter("nomArtcile"),Double.parseDouble(request.getParameter("prix")));
			
			Commande com1 = s.get(Commande.class,Integer.parseInt(request.getParameter("idCom")));
            art1.setCommande(com1);;
			s.save(art1);

			
			log.info("paiement effectué");
			
			s.getTransaction().commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			
			log.error("Erreur enregistrement utilisateur");
			
			s.getTransaction().rollback();
		}
		
	}

}
