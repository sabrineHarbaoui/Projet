package openValue.velib;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class JcdecauxData {

	String mUrl = "https://api.jcdecaux.com/vls/v1/stations?apiKey=293ef23dcfa3c37c8abcdee1d48c81ba19cbb13d&contract=Paris";

	public void collectDataTOFile(){

		try {
			URL monURL = new URL(mUrl);
			URLConnection url = monURL.openConnection();
			InputStream flux = url.getInputStream();
			@SuppressWarnings("resource")
			OutputStream outputStream =
			new FileOutputStream(new File("data.json"));

			int read = 0;
			byte[] bytes = new byte[1024];

			while ((read = flux.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		JcdecauxData data = new JcdecauxData();
		data.collectDataTOFile();
	}
}
