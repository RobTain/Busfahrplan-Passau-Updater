import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import com.itextpdf.text.exceptions.InvalidPdfException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class Update {
	private FileWriter writer;
	private File file;
	private Bushaltestelle bs;

	public Update() throws NoSuchAlgorithmException, KeyManagementException {

		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			public void checkClientTrusted(X509Certificate[] certs, String authType) {
			}

			public void checkServerTrusted(X509Certificate[] certs, String authType) {
			}

		} };

		SSLContext sc = SSLContext.getInstance("SSL");
		sc.init(null, trustAllCerts, new java.security.SecureRandom());
		HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

		// Create all-trusting host name verifier
		HostnameVerifier allHostsValid = new HostnameVerifier() {
			public boolean verify(String hostname, SSLSession session) {
				return true;
			}
		};

		HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
	}

	public void update(LinkedList<Bushaltestelle> linienpool) throws IOException {
		Bushaltestelle bs;
		float prozent;
				LinkedList<Bushaltestelle> updatedList = new LinkedList<Bushaltestelle>();
		for (int i = 0; i < linienpool.size(); i++) {
			bs = linienpool.get(i);
			try {
				PdfReader reader = new PdfReader(bs.linkname);
				String page = PdfTextExtractor.getTextFromPage(reader, 1); //only page 1
				prozent = (float) i / linienpool.size() * 100;
				System.out.println("Sammle Daten: " + Math.round(prozent)+ " %");
				if (page.contains(bs.datum)) {
				} else {
					updatedList.add(bs);
				}
			} catch (InvalidPdfException ex) {
				System.out.println(" Fehler: Link nicht aufrufbar" + bs.buslinie + ": " + bs.bushaltestelle);
			}
		}
		
		writeFile(updatedList);

	}

	private void writeFile(LinkedList<Bushaltestelle> updateList2) throws IOException {

		if (updateList2.isEmpty()) {
			System.out.println("Kein Update verfügbar");
		} else {
			file = new File("Test.txt");
			try {
				//Write outdated Busstations
				writer = new FileWriter(file);
				writer.write("BUSHALTESTELLEN IM LINIENPLAN UPDATEN!!!!! (123 PDF to Image -> 135DPI 75%)");
				writer.write(System.getProperty("line.separator"));
				writer.write("Genau nachschauen, hat sich nur Zeit geändert, oder Linie dazu etc.!!!!");
				writer.write(System.getProperty("line.separator"));
				writer.write(System.getProperty("line.separator"));
				for (int i = 0; i < updateList2.size(); i++) {
					bs = updateList2.get(i);
					writer.write("Linie: " + bs.buslinie + " Bushaltestelle: " + bs.bushaltestelle + " Datum: "
							+ bs.datum);
					writer.write(System.getProperty("line.separator"));
					writer.write(bs.linkname);
					writer.write(System.getProperty("line.separator"));
					writer.write(System.getProperty("line.separator"));
				}
				writer.flush();
				writer.close();
			} catch (IOException e) {
				System.out.println("Fehler, konnte nicht in Datei schreiben!");
			}
			//start texteditor
			if (System.getProperty("os.name").toLowerCase().contains("windows")) {
				  String cmd = "rundll32 url.dll,FileProtocolHandler " + file.getCanonicalPath();
				  Runtime.getRuntime().exec(cmd);
				} 
				else {
				  Desktop.getDesktop().edit(file);
				}

		}
		
	
	}

}
