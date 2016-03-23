import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;

//TODO alles in GitHub ziehen
public class Main {

	private static Linienpool linienpool; 
	private static LinkedList<Bushaltestelle> allStations;
	private static Update update;
	private static LinkedList<Bushaltestelle> updateList;
	
	
	public static void main(String[] args) throws KeyManagementException, NoSuchAlgorithmException, IOException  {
		update = new Update();
		linienpool = new Linienpool();
		allStations = linienpool.allStation;
		update.update(allStations);
           
	}


}
	


