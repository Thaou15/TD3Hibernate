package com.inti.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate date;
	
	@OneToOne(mappedBy = "commande")
	private Paiement paiement;
	
	@OneToMany(mappedBy = "commande", targetEntity = Article.class)
	private List<Article> ListeArticle;


	public Paiement getPaiement() {
		return paiement;
	}

	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}

	public Commande() {
		super();
	}
	
	public Commande(LocalDate date) {
		super();
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<Article> getListeArticle() {
		return ListeArticle;
	}

	public void setListeArticle(List<Article> listeArticle) {
		ListeArticle = listeArticle;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", date=" + date + "]";
	}

}
