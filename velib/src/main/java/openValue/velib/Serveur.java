package openValue.velib;

import java.net.* ;
import java.io.* ;

public class Serveur {

	public static void main(String [] args) {
		ServerSocket srv ;
		int port = 2015 ;
		try {
			srv = new ServerSocket(port) ;
			System.out.println("Serveur Ok") ;
			while ( true ) {
				System.out.println("En attente") ;
				Socket connexion = srv.accept() ;
				System.out.println("Connexion") ;
				BufferedReader input =
						new BufferedReader(new InputStreamReader(connexion.getInputStream()));
				System.out.println(input.readLine()) ;
				connexion.close() ; } }
		catch(IOException e) { }
	}
}          


