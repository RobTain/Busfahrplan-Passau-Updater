import java.util.LinkedList;

/**
 * collects all Bushaltestelle Objects
 * 
 * @author RobTain
 * 
 */
public class Linienpool {
	LinkedList<Bushaltestelle> allStation = new LinkedList<Bushaltestelle>();

	public Linienpool() {
		catchLinienpool();
	}

	/**
	 * create all "Bushaltestellen" Objects and add to LinkedList allStation
	 */
	private void catchLinienpool() {
		Bushaltestelle bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/abteistrasse_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
				"Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB", "Abteistra�e", "08.09.2013");
		allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/breiteich_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Breiteich",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/breslauerstrasse_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Breslauer Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/christdobl_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Christdobl",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-emil-brichta-str._1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Dr. Emil-Brichta Str.",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/englmeierstrasse_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Englmeierstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/firmiangut_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Firmiangut",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/giselastrasse_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Giselastra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amhochpegel_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Am Hochpegel",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzbruecke_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Ilzbr�cke",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/josef-wenzl-str._1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Josef-Wenzl-Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kainzenweg_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Kainzenweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kastenreuth_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Kastenreuth",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/laimgrub_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Laimgrub",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Leopoldstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lindau_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Lindau",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Nagelschmiedgasse",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/prinz-eugen-strasse_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Prinz Eugen Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Rathaus",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "R�merplatz",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/saeumerweg_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "S�umerweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/scharbachweg_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Scharbachweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schoenleitnerweg_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Sch�nleitnerweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schulzentrum_aok_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Schulzentrum/AOK",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/st.anton_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "St. Anton",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sulzsteg_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Sulzsteg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/waldschmidtstrasse_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Waldschmidtstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/wilhelm-niedermayer-str._1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "W.-Niedermayer Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zahnradfabrik_werk1_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Zahnradfabrik Werk 1",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zieglreuth_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Zieglreuth",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schanzlbruecke_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Schanzlbr�cke",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/achatiusstrasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Achatiusstra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/auenweg_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Auenweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aufischer_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Aufischer",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Augustinergasse",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/baeckerholz_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "B�ckerholz",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/christdobl_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Christdobl",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/evangelischekirche_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Evangelische Kirche",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/garhammerweg_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Garhammerweg",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/haibach_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Haibach",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hals_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "hals",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hochstein_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Hochstein",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hoernerweg_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "H�rnerweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzbruecke_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Ilzbr�cke",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzleite_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Ilzleite",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jaegersteig_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "J�gersteig",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jahnstrasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Jahnstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jesuitenschloessl_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Jesuitenschl��l",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/johann-bergler-strasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "J.-Bergler Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kirchenplatz_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Kirchenplatz",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kremserstrasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Kremser Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lindau_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Lindau",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muehltalstrasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "M�hltalstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Nagelschmiedgasse",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/obereschneckenbergstrasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "O. Schneckenbergstra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/oetkersiedlung_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Oetkersiedlung",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Rathaus",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "R�merplatz",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schwendistrasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Schwendistra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stadttheater_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Stadttheater",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zahnradfabrik_werk1_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Zahnradfabrik Werk 1",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schanzlbruecke_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Schanzlbr�cke",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig1d_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "ZOB Bussteig 1D",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/landrichterstrasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Landrichterstra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rosensteig_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: B�ckerholz/Hochstein - ZOB - Achleiten",
		 "Rosensteig",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/auerspergstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Auerspergstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/danzigerstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Danziger Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/donauhof_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Donauhof",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/donau-schwaben-strasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Donau-Schwaben Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-ernst.-derra-str._5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Dr. Ernst. Derra Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-geiger-weg_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Dr. Geiger Weg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eggendobl_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Eggendobl",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/fuerstenweg_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "F�rstenweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gaissabruecke_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Gai�a Br�cke",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gertraudstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Gertraudstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/glockenstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Glockenstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gretli-fuchs-strasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Gretli-Fuchs Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/grillenoed_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Grillen�d",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/irring_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Irring",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jaegerreuth_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "J�gerreuth",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kachletstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Kachletstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kiesling_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Kiesling",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kohlbruck_erlebnisbad_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Kohlbruck/Erlebnisbad PEB",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kohlbruckbruecke_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Kohlbruck/Br�cke",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kohlbruck_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Kohlbruck",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kraftstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Kraftstrasse",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kubinstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Kubinstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lambergstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Lambergstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Leopoldstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lueftlbergstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "L�ftlbergstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/maierhof_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Maierhof",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/minihofstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Minihofstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/neureut_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Neureut",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/passavia_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Passavia",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/patriching_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Patriching",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/plantage_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Plantage",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/pramoed_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Pram�d",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ries_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Ries",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ries_wasserturm_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Ries/Wasserturm",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sailerwoehr_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Sailerw�hr",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schaldingl.d.d_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Schalding links der Donau",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schulstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Schulstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/simmerlingweg_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Simmerlingweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/st.korona_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "St. Korona",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stadtgaertnerei_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Stadtg�rtnerei",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stelzlhof_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Stelzlhof",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/tannenleite_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Tannenleite",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/woerth_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "W�rth",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Leopoldstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zahnradfabrik_werk2_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Zahnradfabrik Werk 2",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig3_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "ZOB Bussteig 3",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzl_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Am Schanzl",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/betty-pfleger-strasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Betty Pfleger Str.",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zieglstadl_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Zieglstadl",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/moos_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Moos",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/st.korona2_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "St. Korona 2",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/englbolding_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Englbolding",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schellkoepfing_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Schellk�pfing",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hellersberg_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Hellersberg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/walding_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Walding",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/westerburgerstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Westerburgerstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/auerspergstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Auerspergstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/danzigerstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Danziger Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/donauhof_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Donauhof",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/donau-schwaben-strasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Donau Schwaben Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-ernst.-derra-str._5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Dr. Ernst. Derra Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-geiger-weg_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Dr. Geiger Weg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eggendobl_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Eggendobl",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/fattingerstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Fattingerstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/freudenhain_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Freudenhain",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/fuerstenweg_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "F�rstenweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gaishofen_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Gaishofen",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gaissabruecke_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Gai�a Br�cke",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gertraudstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Gertraudstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/glockenstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Glockenstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gretli-fuchs-strasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Gretli Fuchs Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/grillenoed_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Grillen�d",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/irring_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Irring",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jaegerreuth_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "J�gerreuth",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kachletstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Kachletstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kiesling_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Kiesling",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kohlbruck_erlebnisbad_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Kohlbruck / Erlebnisbad PEB",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kraftstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Kraftstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kubinstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Kubinstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lambergstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Lambergstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Leopoldstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lueftlbergstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "L�ftlbergstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/maierhof_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Maierhof",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/minihofstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Minihofstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/neureut_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Neureut",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/passavia_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Passavia",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/patriching_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Patriching",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/patriching-siedlung_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Patriching Siedlung",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/plantage_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Plantage",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/pramoed_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Pram�d",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ries_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Ries",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ries_rennweg_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Ries Rennweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ries_wasserturm_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Ries Wasserturm",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sailerwoehr_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Sailerw�hr",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schaldingl.d.d_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Schalding links der Donau",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schanzlbruecke_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Schanzlbr�cke",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schulstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Schulstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/simmerlingweg_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Simmerlingweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stelzlhof_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Stelzlhof",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/westerburgerstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Westerburgerstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/woerth_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "W�rth",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zieglstadl_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Zieglstadl",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig2_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "ZOB Bussteig 2",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/auerspergstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Auerspergstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aeusserespitalhofstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "�u�ere Spitalhofstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzl_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Am Schanzl",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/anzengruberstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Anzengruberstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bockhofweg_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Bockhofweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/danzigerstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Danziger Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-geiger-weg_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Dr. Geiger Weg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eggendobl_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Eggendobl",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eichendorffstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Eichendorffstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eichetstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Eichetstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/freudenhain_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Freudenhain",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/fuerstenweg_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "F�rstenweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gertraudstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Gertraudstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/glockenstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Glockenstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/grillenoed_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Grillen�d",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/herrmann-woesner-str._7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Auerspergstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/holzmannstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Holzmannstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kraftstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Kraftstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kreuzbergstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Kreuzbergstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lambergstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Lambergstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lautensackstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Lautensackstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Leopoldstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/martin-seitz-strasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Martin Seitz Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/max-matheis-strasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Max Matheis Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/neustift_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Neustift",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/plantage_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Plantage",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reinhard-raffalt-strasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Reinhard Raffalt Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ries_rennweg_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Ries Rennweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sailerwoehr_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Sailerw�hr",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schreinerbauerweg_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Schreinerbauerweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schulstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Schulstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/senefelderstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Senefelderstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sturmbergweg_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Sturmbergweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/westendstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Westendstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/westerburgerstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Westerburgerstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig3_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "ZOB Bussteig 3",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/auerspergstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Auerspergstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/anzengruberstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Anzengruberstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aeusserespitalhofstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "�u�ere Spitalhofstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/danzigerstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Danzigerstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-geiger-weg_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Dr. Geiger Weg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eggendobl_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Eggendobl",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eichetstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Eichetstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/fuerstenweg_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "F�rstenweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gertraudstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Gertraudstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/glockenstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Glockenstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/grillenoed_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Grillen�d",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/herrmann-woesner-str._7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Herrmann Woesner Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/holzmannstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Holzmannstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kraftstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Kraftstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kreuzbergstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Kreuzbergstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lambergstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Lambergstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lautensackstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Lautensackstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Leopoldstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/martin-seitz-strasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Martin Seitz Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/max-matheis-strasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Max Matheis Strasse",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/neustift_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Neustift",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/plantage_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Plantage",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reinhard-raffalt-strasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Reinhard Raffalt Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ries_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Ries",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sailerwoehr_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Sailerw�hr",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schanzlbruecke_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Schanzlbr�cke",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schreinerbauerweg_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Schreinerbauerweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schulstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Schulstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/senefelderstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Senefelderstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/westerburgerstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "Westerburgerstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig2_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstra�e",
		 "ZOB Bussteig 2",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/apfelkoch_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Apfelkoch",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Augustergasse",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Bahnhofstrasse",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/birkhamerstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Birkhamerstra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/breslauerstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Breslauerstra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-winklhofer-strasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Dr. Winklhofer Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gionstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Gionstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/graf-salm-strasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Graf Salm Stra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gustav-haydn-strasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Gustav Haydn Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hacklstein_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Hacklstein",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Hauptbahnhof",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/heining_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Heining",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kachlet_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Kachlet",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/klinikum_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Klinikum",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/koenigsbergerstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "K�nigsbergerstra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kohlbruck_erlebnisbad_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Kohlbruck / Erlebnisbad PEB",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/oberoederweg_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Ober�derweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/raiffeisenstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Raiffeisenstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteig_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Rittsteig",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schoenleitnerweg_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Sch�nleitnerweg",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/simmerlingweg_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Simmerlingweg",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/soeldenpeterweg_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "S�ldenpeterweg",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/steinbachmuehle_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Steinbachm�hle",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stelzhamerstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Stelzbachm�hle",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stelzhamerstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Stelzhamerstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/universitaet_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Universit�t",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/vornholz_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Vornholz",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/weinleitenweg_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Weinleitenweg",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/winzerleite_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "Winzerleite",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/woerthstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "W�rthstra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig3_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - K�nigschalding",
		 "ZOB Bussteig 3",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/apfelkoch_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Apfelkoch",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Augustinergasse",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/b.-vonbehr-str._8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Augustinergasse",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Bahnhofstra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/birkhamerstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Birkhamerstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/breslauerstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Breslauer Stra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eich_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Eich",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gionstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Gionstra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/graf-salm-strasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Augustinergasse",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hacklstein_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Hacklstein",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Hauptbahnhof",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/heining_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Heining",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/herrmann-woesner-str._8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Herrmann Woesner Stra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hofmannsthalstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Hofmannsthalstra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kachlet_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Kachlet",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/klinikum_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Klinikum",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/koenigsbergerstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "K�nigsbergerstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/koenigschalding_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "K�nigschalding",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/neustift_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Neustift",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/parkhausbahnhofstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Parkhaus Bahnhofstrasse",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/pater-rupert-mayer-str._8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Pater Rupert Mayer Stra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/raiffeisenstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Raiffeisenstra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/richterstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Richterstra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteig_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Rittsteig",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteigerstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Rittsteigerstra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schoenleitnerweg_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Sch�nleitnerweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/simmerlingweg_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Simmerlingweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/soeldenpeterweg_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "S�ldenpeterweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stallerweg_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Stallerweg",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/steinbachmuehle_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Steinbachm�hle",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stelzhamerstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Stelzhamerstra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/universitaet_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Universit�t",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/vornholz_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Vornholz",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/weinleitenweg_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Weinleitenweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/westendstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Westendstra�e",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/woerthstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "W�rthstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig2_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: K�nigschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "ZOB Bussteig 2",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/buchenstrasse_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Buchenstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Bahnhofstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gartenstrasse_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Gartenstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Hauptbahnhof",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hochlandweg_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Hochlandweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hoffeldweg_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Hoffeldweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/holzmannstrasse_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Holzmannstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/neustift_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Neustift",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/pruegelweg_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Pr�gelweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/raiffeisenstrasse_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Raiffeisenstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reuthingerweg_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Reuthingerweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schaldingr.d.d_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Schalding rechts der Donau",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/steinbachmuehle_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Steinbachm�hle",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stelzhamerstrasse_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Stelzhamerstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/westendstrasse_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Westendstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/winzerleite_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Winzerleite",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig4_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "ZOB Bussteig 4",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/buchenstrasse_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Buchenstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Bahnhofstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/einoederstrasse_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Ein�derstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gartenstrasse_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Gartenstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Hauptbahnhof",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hochlandweg_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Hochlandweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hoffeldweg_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Hoffeldweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/holzmannstrasse_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Holzmannstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/neustift_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Neustift",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/parkhausbahnhofstrasse_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Parkhaus Bahnhofstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/pruegelweg_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Pr�gelweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/raiffeisenstrasse_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Raiffeisenstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reuthingerweg_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Reuthingerstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schaldingr.d.d_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Schalding rechts der Donau",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/steinbachmuehle_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Steinbachm�hle",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stelzhamerstrasse_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Stelzhamerstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/westendstrasse_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Westendstra�e",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/winzerleite_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Winzerleite",
		 "08.09.2013");
		 allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/b.-vonbehr-str._11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "B. von Behr Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/anzengruberstrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Anzengruberstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Bahnhofstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/carossastrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Carossastra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eichendorffstrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Eichendorffstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eichetstrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Eichetstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/emerenz-meier-str._11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Emerenz Meier Str.", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hacklstein_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Hacklstein", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Hauptbahnhof", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/heining_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Heining", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kachlet_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Kachlet", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lautensackstrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Lautensackstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/martin-seitz-strasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Martin Seitz Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/raiffeisenstrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Raiffeisenstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reinhard-raffalt-strasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Reinhard Raffalt Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteigerstrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Rittsteigerstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stallerweg_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Stallerweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/steinbachmuehle_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Steinbachm�hle", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stelzhamerstrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Stelzhamerstrasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig4_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "ZOB Bussteig 4", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/carossastrasse_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Carossastra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Bahnhofstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/emerenz-meier-str._11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Emerenz Meier Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hacklstein_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Hacklstein", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/heining_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Heining", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Hauptbahnhof", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/heining_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Heining", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kachlet_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Kachlet", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/parkhausbahnhofstrasse_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Parkhaus Bahnhofstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/raiffeisenstrasse_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Raiffeisenstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reinhard-raffalt-strasse_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Reinhard Raffalt Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/senefelderstrasse_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Senefelderstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/steinbachmuehle_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Steinbachm�hle", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stelzhamerstrasse_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Stelzhamerstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/anger_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: L�ftlberg - ZOB - Mariahilf-Grenzstation", "Anger", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: L�ftlberg - ZOB - Mariahilf-Grenzstation", "Augustinergasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aumuehlweg_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: L�ftlberg - ZOB - Mariahilf-Grenzstation", "Aum�hlweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eggendobl_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: L�ftlberg - ZOB - Mariahilf-Grenzstation", "Eggendobl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/fuerstenweg_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: L�ftlberg - ZOB - Mariahilf-Grenzstation", "F�rstenweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jahnstrasse_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: L�ftlberg - ZOB - Mariahilf-Grenzstation", "Jahnstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kirchenplatz_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: L�ftlberg - ZOB - Mariahilf-Grenzstation", "Kirchenplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lueftlberg_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: L�ftlberg - ZOB - Mariahilf-Grenzstation", "L�ftlberg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/mariahilf-grenzstation_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: L�ftlberg - ZOB - Mariahilf-Grenzstation", "Mariahilf Grenzstation", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/mozartstrasse_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: L�ftlberg - ZOB - Mariahilf-Grenzstation", "Mozartstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muffatstrasse_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: L�ftlberg - ZOB - Mariahilf-Grenzstation", "Muffatstrasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schaerdingerstr._k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: L�ftlberg - ZOB - Mariahilf-Grenzstation", "Sch�rdingerstr.", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schulstrasse_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: L�ftlberg - ZOB - Mariahilf-Grenzstation", "Schulstrasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stadttheater_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: L�ftlberg - ZOB - Mariahilf-Grenzstation", "Stadttheater", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig4_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: L�ftlberg - ZOB - Mariahilf-Grenzstation", "ZOB Bussteig 4", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/anger_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - L�ftlberg", "Anger", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - L�ftlberg", "Augustinergasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzl_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - L�ftlberg", "Am Schanzl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aumuehlweg_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - L�ftlberg", "Aum�hlweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eggendobl_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - L�ftlberg", "Eggendobl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jahnstrasse_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - L�ftlberg", "Jahnstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/mariahilf-grenzstation_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - L�ftlberg", "Mariahilf Grenzstation", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/mayrhof_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - L�ftlberg", "Mayrhof", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/mozartstrasse_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - L�ftlberg", "Mozartstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muffatstrasse_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - L�ftlberg", "Muffatstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schaerdingerstr._k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - L�ftlberg", "Sch�rdingerstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schmiedgasse_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - L�ftlberg", "Schmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schulstrasse_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - L�ftlberg", "Schulstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stadttheater_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - L�ftlberg", "Stadttheater", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig4_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - L�ftlberg", "ZOB Bussteig 4", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "Augustinergasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzbruecke_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "Ilzbr�cke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kirchenplatz_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "Kirchenplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/linzerstrasse_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "Linzerstra�e", "18.11.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muehltalstrasse_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "M�hltalstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schanzlbruecke_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "Schanzlbr�cke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sieglgut_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "Sieglgut", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/voglau_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "Voglau", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/christdobl_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "Christdobl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jahnstrasse_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "jahnstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/klafterbrunnweg_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "Klafterbrunnweg", "18.11.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lindenthal1_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "Lindenthal 1", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muehltal_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "M�hltal", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "R�merplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sieglberg_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "Sieglberg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stadttheater_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "Stadttheater", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig4_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - M�hltal/Lindental", "ZOB Bussteig 4", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: M�hltal/Lindental - ZOB - Sieglberg/Sieglgut", "Augustinergasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzlturm_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: M�hltal/Lindental - ZOB - Sieglberg/Sieglgut", "Am Schanzlturm", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/christdobl_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: M�hltal/Lindental - ZOB - Sieglberg/Sieglgut", "Christdobl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzbruecke_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: M�hltal/Lindental - ZOB - Sieglberg/Sieglgut", "Ilzbr�cke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kirchenplatz_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: M�hltal/Lindental - ZOB - Sieglberg/Sieglgut", "Kirchenplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lindenthal2_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: M�hltal/Lindental - ZOB - Sieglberg/Sieglgut", "Lindenthal 2", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muehltal_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: M�hltal/Lindental - ZOB - Sieglberg/Sieglgut", "M�hltal", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muehltalstrasse_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: M�hltal/Lindental - ZOB - Sieglberg/Sieglgut", "M�hltalstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: M�hltal/Lindental - ZOB - Sieglberg/Sieglgut", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: M�hltal/Lindental - ZOB - Sieglberg/Sieglgut", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: M�hltal/Lindental - ZOB - Sieglberg/Sieglgut", "R�merplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schmiedgasse_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: M�hltal/Lindental - ZOB - Sieglberg/Sieglgut", "Schmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stadttheater_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: M�hltal/Lindental - ZOB - Sieglberg/Sieglgut", "Stadttheater", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig4_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: M�hltal/Lindental - ZOB - Sieglberg/Sieglgut", "ZOB Bussteig 4", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zollamtsaming_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: M�hltal/Lindental - ZOB - Sieglberg/Sieglgut", "Zollamt/Saming", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/apfelkoch_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Apfelkoch", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzlturm_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Am Schanzlturm", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aufischer_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Aufischer", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eduard-hamm-strasse_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Eduard Hamm Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/giselastrasse_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Giselastra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hochstrasse_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Hochstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ingling_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Ingling", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/klinikum_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Klinikum", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Leopoldstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lindau_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Lindau", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "R�merplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sulzsteg_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Sulzsteg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/untereschneckenbergstr._k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Untere Schneckenbergstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/untereschneckenbergstr.a_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Untere Schneckenbergstra�e A", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/untereschneckenbergstr.b_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Untere Schneckenbergstra�e B", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/untereschneckenbergstr.c_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "Untere Schneckenbergstra�e C", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/woerthstrasse_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "W�rthstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig4_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am H�gl/Sulzsteg", "ZOB Bussteig 4", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amhoegl_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Am H�gl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/apfelkoch_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Apfelkoch", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aufischer_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Aufischer", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eduard-hamm-strasse_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Eduard Hamm Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/giselastrasse_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Giselastra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hochstrasse_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Hochstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/klinikum_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Klinikum", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Leopoldstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lindau_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Lindau", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "R�merplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schanzlbruecke_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Schanzlbr�cke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sulzsteg_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Sulzsteg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/untereschneckenbergstr.a_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Untere Schneckenbergstra�e A", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/untereschneckenbergstr.b_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Untere Schneckenbergstra�e B", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/untereschneckenbergstr.c_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "Untere Schneckenbergstra�e C", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/woerthstrasse_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "W�rthstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig4_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am H�gl/Sulzsteg - ZOB - Klinikum", "ZOB Bussteig 4", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aeusserespitalhofstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "�u�ere Spitalhofstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Bahnhofstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bernhard-setzerstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Bernhard Setzer Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/brand_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Brand", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/brandweg_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Brandweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/danzigerstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Danziger Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-geiger-weg_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Dr. Geiger Weg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gutenbergstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Gutenbergstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hammerbachstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Hammerbachstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Hauptbahnhof", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/herrmann-woesner-str._k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Herrmann Woesner Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/holzheimerstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Holzheimerstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/holzmannstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Holzmannstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/johann-riederer-strasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Johann Riederer Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/medienstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Medienstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/neustift_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Neustift", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sagmeisterweg_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Sagmeisterweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schreinerholzerweg_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Schreinerholzerweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig4_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "ZOB Bussteig 4", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aeusserespitalhofstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "�u�ere Spitalhofstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Bahnhofstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bernhard-setzerstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Bernhard Setzer Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/brand(bedarfshaltestelle)_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Brand (Bedarfshaltestelle)", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/brand_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Brand", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/brandweg_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Brandweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/danzigerstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Danziger Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-geiger-weg_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Dr. Geiger Weg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gutenbergstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Gutenbergstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hammerbachstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Hammerbachstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Hauptbahnhof", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/herrmann-woesner-str._k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Herrmann Woesner Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/holzheimerstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Holzheimerstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/holzmannstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Holzmannstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/johann-riederer-strasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Johann Riederer Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/medienstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Medienstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/neustift_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Neustift", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/paula-deppe-strasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Paula Deppe Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sagmeisterweg_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Sagmeisterweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schreinerholzerweg_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Schreinerholzerweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sperrwies_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Sperrwies", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/westendstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Westendstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/parkhausbahnhofstrasse_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstra�e - ZOB - R�merplatz", "Parkhaus Bahnhofstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzl_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstra�e - ZOB - R�merplatz", "Am Schanzl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzlturm_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstra�e - ZOB - R�merplatz", "Am Schanzlturm", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstra�e - ZOB - R�merplatz", "Bahnhofstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/domplatz_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstra�e - ZOB - R�merplatz", "Domplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstra�e - ZOB - R�merplatz", "Hauptbahnhof", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathausplatz_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstra�e - ZOB - R�merplatz", "Rathausplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/residenzplatz_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstra�e - ZOB - R�merplatz", "Residenzplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rindermarkt_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstra�e - ZOB - R�merplatz", "Rindermarkt", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig5_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstra�e - ZOB - R�merplatz", "ZOB Bussteig 5", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: R�merplatz - ZOB - Parkhaus Bahnhofstra�e ", "Hauptbahnhof", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: R�merplatz - ZOB - Parkhaus Bahnhofstra�e ", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: R�merplatz - ZOB - Parkhaus Bahnhofstra�e ", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: R�merplatz - ZOB - Parkhaus Bahnhofstra�e ", "R�merplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schlosserstiege_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: R�merplatz - ZOB - Parkhaus Bahnhofstra�e ", "Schlosserstiege", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig5_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: R�merplatz - ZOB - Parkhaus Bahnhofstra�e ", "ZOB Bussteig 5", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: R�merplatz - ZOB - Parkhaus Bahnhofstra�e ", "Bahnhofstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schanzlbruecke_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: R�merplatz - ZOB - Parkhaus Bahnhofstra�e ", "Schanzlbr�cke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/abteistrasse_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Abteistra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amhochpegel_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Am Hochpegel", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzlturm_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Am Schanzlturm", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/breslauerstrasse_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Breslauer Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/christdobl_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Christdobl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-emil-brichta-str._1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Dr. Emil Brichta Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/englmeierstrasse_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Englmeierstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/firmiangut_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Firmiangut", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/giselastrasse_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Giselastra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzbruecke_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Ilzbr�cke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/josef-wenzl-str._1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Josef Wenzl Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kainzenweg_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Kainzenweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kohlbruck_erlebnisbad_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Kohlbruck / Erlebnisbad PEB", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/laimgrub_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Laimgrub", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Leopoldstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lindau_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Lindau", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/prinz-eugen-strasse_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Prinz Eugen Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "R�merplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schoenleitnerweg_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Sch�nleitnerweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schulzentrum_aok_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Schulzentrum / AOK", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/st.anton_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "St. Anton", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/waldschmidtstrasse_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Waldschmiedstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig1ab_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "ZOB Bussteig 1 AB", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amhochpegel_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Am Hochpegel", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzlturm_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Am Schanzlturm", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/breiteich_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Breiteich", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/breslauerstrasse_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Breslauer Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/christdobl_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Christdobl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-emil-brichta-str._2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Dr. Emil Brichta Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/englmeierstrasse_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Englmeierstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/giselastrasse_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Giselastra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzbruecke_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Ilzbr�cke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/josef-wenzl-str._2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Josef Wenzl Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kainzenweg_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Kainzenweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kastenreuth_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Kastenreuth", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kohlbruck_erlebnisbad_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Kohlbruck / Erlebnisbad PEB", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Leopoldstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/prinz-eugen-strasse_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Prinz Eugen Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "R�merplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/saeumerweg_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "S�umerweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/scharbachweg_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Scharbachweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schoenleitnerweg_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Sch�nleitnerweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schulzentrum_aok_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Schulzentrum / AOK", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/st.anton_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "St. Anton", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sulzsteg_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Sulzsteg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/waldschmidtstrasse_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Waldschmidtstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/wilhelm-niedermayer-str._2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Wilhelm Niedermayer Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig1ab_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "ZOB Bussteig 1 AB", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/achleiten_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Achleiten", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzlturm_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Am Schanzlturm", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/auenweg_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Auenweg", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aufischer_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Aufischer", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Augustinergasse", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/evangelischekirche_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Evangelische Kirche", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/garhammerweg_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Garhammerweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/haibach_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Haibach", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hoernerweg_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "H�rnerweg", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jaegersteig_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "J�gersteig", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jesuitenschloessl_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Jesuitenschl�ssl", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/johann-bergler-strasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Johann Bergler Stra�e", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kremserstrasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Kremserstra�e", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lindau_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Lindau", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muehltalstrasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "M�hltalstra�e", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/obereschneckenbergstrasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Obere Schneckenbergstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "R�merplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schmiedgasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Schmiedgasse", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schwendistrasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Schwendistra�e", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stadttheater_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Stadttheater", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zahnradfabrik_werk1_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "Zahnradfabrik Werk 1", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig1ab_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - B�ckerholz", "ZOB Bussteig 1 AB", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/achatiusstrasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Hochstein", "Achatiusstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/achleiten_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Achleiten", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzlturm_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Am Schanzlturm", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/auenweg_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Auenweg", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Augustinergasse", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/christdobl_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Christdobl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/haibach_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Haibach", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hals_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Hals", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hoernerweg_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "H�rnerweg", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzbruecke_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Ilzbr�cke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzleite_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Ilzleite", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jesuitenschloessl_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Jesuitenschl�ssl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/johann-bergler-strasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Johann Bergler Stra�e", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kremserstrasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Kremserstra�e", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/landrichterstrasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Landrichterstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muehltalstrasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "M�hltalstra�e", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/oetkersiedlung_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Oetkersiedlung", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "R�merplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rosensteig_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Rosensteig", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schmiedgasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Schmiedgasse", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schwendistrasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Schwendistra�e", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stadttheater_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "Stadttheater", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig1ab_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - B�ckerholz", "ZOB Bussteig 1 AB", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/b.-vonbehr-str._78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "B. von Behr Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/buchenstrasse_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Buchenstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-winklhofer-strasse_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Dr. Winklhofer Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gartenstrasse_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Gartenstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gionstrasse_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Gionstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gustav-haydn-strasse_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Gustav Haydn Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/herrmann-woesner-str._78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Herrmann Woesner Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hochlandweg_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Hochlandweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hoffeldweg_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Hoffeldweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/neustift_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Neustift", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/oberoederweg_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Ober�derweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/pruegelweg_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Pr�gelweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reuthingerweg_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Reuthingerweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/richterstrasse_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Richterstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteig_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Rittsteig", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteigerstrasse_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Rittsteigerstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schaldingr.d.d_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Schalding rechts der Donau", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stallerweg_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Stallerweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/winzerleite_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Winzerleite", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/b.-vonbehr-str._78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "B. von Behr Stra�e", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/buchenstrasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Buchenstra�e", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-winklhofer-strasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Dr. Winklhofer Stra�e", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/einoederstrasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Ein�derstra�e", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gartenstrasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Gartenstra�e", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gionstrasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Gionstra�e", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gustav-haydn-strasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Gustav Haydn Stra�e", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/herrmann-woesner-str._78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Herrmann Woesner Stra�e", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hochlandweg_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Hochlandweg", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hoffeldweg_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Hoffeldweg", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hochlandweg_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Hochlandweg", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/neustift_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Neustift", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/oberoederweg_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Ober�derweg", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/pruegelweg_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Pr�gelweg", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reuthingerweg_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Reuthingerweg", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/richterstrasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Richterstra�e", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteig_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Rittsteig", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteigerstrasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Rittsteigerstra�e", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schaldingr.d.d_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Schalding rechts der Donau", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stallerweg_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Stallerweg", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/winzerleite_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Winzerleite", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/b.-vonbehr-str._79zob-eichendorffstr..pdf",
				"Linie 79: ZOB - Eichendorffstra�e", "B. von Behr Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eichetstrasse_79zob-eichendorffstr..pdf",
				"Linie 79: ZOB - Eichendorffstra�e", "Eichetstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/martin-seitz-strasse_79zob-eichendorffstr..pdf",
				"Linie 79: ZOB - Eichendorffstra�e", "Martin Seitz Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteigerstrasse_79zob-eichendorffstr..pdf",
				"Linie 79: ZOB - Eichendorffstra�e", "Rittsteigerstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stallerweg_79zob-eichendorffstr..pdf",
				"Linie 79: ZOB - Eichendorffstra�e", "Stallerweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/anzengruberstrasse_79eichendorffstr.-zob.pdf",
				"Linie 79: Eichendorffstra�e - ZOB", "Anzengruberstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/carossastrasse_79eichendorffstr.-zob.pdf",
				"Linie 79: ZOB - Eichendorffstra�e", "Carossastra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eichendorffstrasse_79eichendorffstr.-zob.pdf",
				"Linie 79: ZOB - Eichendorffstra�e", "Eichendorffstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/emerenz-meier-str._79eichendorffstr.-zob.pdf",
				"Linie 79: ZOB - Eichendorffstra�e", "Emerenz Meier Stra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lautensackstrasse_79eichendorffstr.-zob.pdf",
				"Linie 79: ZOB - Eichendorffstra�e", "Lautensackstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/raiffeisenstrasse_79eichendorffstr.-zob.pdf",
				"Linie 79: ZOB - Eichendorffstra�e", "Raiffeisenstra�e", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reinhard-raffalt-strasse_79eichendorffstr.-zob.pdf",
				"Linie 79: ZOB - Eichendorffstra�e", "Reinhard Raffalt Stra�e", "08.09.2013");
		allStation.add(bs);
	
	}

	public LinkedList<Bushaltestelle> getAllStation() {
		return allStation;
	}

}
