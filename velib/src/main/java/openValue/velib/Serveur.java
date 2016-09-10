package openValue.velib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

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


