package Client;
import java.rmi.Naming;
import java.util.ArrayList;

import Produit.Produit;
import Serveur.ServerInterface;

public class Client1 {
	
public static void main(String argv[]) {
		
		try {
			ServerInterface objet = (ServerInterface) Naming.lookup("rmi://localhost:2048/Obj");
			objet.enregistrer_client(new ClientImplementation());
			
            
		}
		
		catch (Exception e) {
	    	e.printStackTrace();
	}
		
	}
	

}

