package Serveur;

import java.rmi.Naming;
import java.rmi.Remote;
import java.util.ArrayList;




public class Serveur {


public static void main(String argv[]) {
		try {
			ServerImplementation obj = new ServerImplementation();
			java.rmi.registry.LocateRegistry.createRegistry(2048);
			Naming.rebind("//:2048/Obj",obj);
			System.out.println("server en attente");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}