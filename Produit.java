package Produit;

public class Produit implements java.io.Serializable {

	 String nom;
	  private int quantite;
	public Produit(String nom,int quantite) {
		this.nom=nom;
		this.quantite=quantite;
	     
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
}
