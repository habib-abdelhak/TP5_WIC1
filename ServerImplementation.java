package Serveur;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.*;

import Produit.Produit;
import Client.ClientInterface;



public class ServerImplementation extends UnicastRemoteObject implements  ServerInterface {
	static ArrayList<Produit> produits = new ArrayList<Produit>(); 
	static ArrayList<ClientInterface> clients = new ArrayList<ClientInterface>();
	public ServerImplementation()throws RemoteException{} 
	
	public void Ajouter_produit(String nom, int quantite) throws RemoteException{
	        Produit product = new Produit(nom, quantite);
	        produits.add(product); 
	        
			alerte();
		
 
	        
	    }
	
	public int quantite_produit(String nom) throws RemoteException {
		
		for(int i=0;i<produits.size();i++) {
		if(produits.get(i).getNom().equals(nom)) {	
        return produits.get(i).getQuantite();			
        }
		}
		alerte();

		return -1;
		}
	
	
	public ArrayList<Produit> Liste_produits() throws RemoteException {
		return produits;		
	}
	
	public void modifier_quantite(String nom,int c) throws RemoteException {
		
		for(Produit product:produits) {

			if(product.getNom().equals(nom)) {
				int x=product.getQuantite();
				product.setQuantite(x-c);
				
				System.out.println("le quantite du produit est : "+product.getQuantite());
			
			for(int j=0;j<clients.size();j++) {
			
			alerte();
		}
			}
		}
	}
	
	public void enregistrer_client(ClientInterface v) throws RemoteException {
		
		clients.add(v);
		
	}
	
    public void alerte() throws RemoteException {
		
		for(ClientInterface client:clients) {
			
			 client.notification();	
		}
		}

	public void ajouter_quantite(String nom,int c) throws RemoteException {
		
		for(Produit product:produits) {

			if(product.getNom().equals(nom)) {
				int x=product.getQuantite();
				product.setQuantite(x+c);
				
				System.out.println("le quantite du produit est : "+product.getQuantite());
			
			for(int j=0;j<clients.size();j++) {
			
			alerte();
		}
			}
		}
	}

	@Override
	public void retirerQuantite(String nomProduit, int quantite) throws RemoteException {
		// TODO Auto-generated method stub
		
	}


	}
		   
