<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fiche de commande</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>
 <form method="post">
  <h1> Paiement</h1>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label" >Montant</label>
    <input type="number" name="montant" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">  
  </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label" >Date paiement (AAAA-MM-JJ)</label>
    <input type="text" name="datepaie"  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">  
  </div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="paiement" id="flexRadioDisabled" value="paypal">
  <label class="form-check-label" for="flexRadioDisabled">
    Paypal
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="paiement" id="flexRadioCheckedDisabled" checked value="cb">
  <label class="form-check-label" for="flexRadioCheckedDisabled">
    CB
  </label>
</div>
 <h3>Paypal</h3>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label" >Numero compte</label>
    <input type="text" name="numcompteP"  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">  
  </div>
  <h3>CB</h3>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label" >Numero carte</label>
    <input type="text" name="numCarte"  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">  
  </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label" >Date d'expiration</label>
    <input type="text" name="dateExp"  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">  
  </div>
  
  
  <button type="submit" class="btn btn-primary">Submit</button>
  <button type="reset" class="btn btn-danger">Annuler</button>
  </form>
</body>
</html>