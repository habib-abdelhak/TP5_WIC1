package Serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Produit.Produit;
import Client.ClientInterface;



public interface ServerInterface extends Remote {
	public int quantite_produit(String nom) throws RemoteException;
    public ArrayList<Produit> Liste_produits() throws RemoteException;
 
    public void retirerQuantite(String nomProduit ,int quantite) throws RemoteException;
    public void alerte()throws RemoteException;
    public void Ajouter_produit(String nom, int quantite) throws RemoteException;
    public void modifier_quantite(String nom,int c) throws RemoteException;
    public void enregistrer_client(ClientInterface v)throws RemoteException;
    public void ajouter_quantite(String nom,int c) throws RemoteException;

}

