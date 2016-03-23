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
				"Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB", "Abteistraße", "08.09.2013");
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
		 "Breslauer Straße",
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
		 "Englmeierstraße",
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
		 "Giselastraße",
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
		 "Ilzbrücke",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/josef-wenzl-str._1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Josef-Wenzl-Straße",
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
		 "Leopoldstraße",
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
		 "Prinz Eugen Straße",
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
		 "Römerplatz",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/saeumerweg_1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "Säumerweg",
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
		 "Schönleitnerweg",
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
		 "Waldschmidtstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/wilhelm-niedermayer-str._1_2lindau_zieglreuth-zob-kohlbruck_erlebnisb..pdf",
		 "Linie 1/2: Lindau/Ziegelreuth - ZOB - Kohlbruck/Erlebnisbad PEB",
		 "W.-Niedermayer Straße",
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
		 "Schanzlbrücke",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/achatiusstrasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Achatiusstraße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/auenweg_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Auenweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aufischer_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Aufischer",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Augustinergasse",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/baeckerholz_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Bäckerholz",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/christdobl_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Christdobl",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/evangelischekirche_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Evangelische Kirche",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/garhammerweg_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Garhammerweg",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/haibach_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Haibach",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hals_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "hals",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hochstein_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Hochstein",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hoernerweg_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Hörnerweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzbruecke_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Ilzbrücke",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzleite_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Ilzleite",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jaegersteig_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Jägersteig",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jahnstrasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Jahnstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jesuitenschloessl_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Jesuitenschlößl",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/johann-bergler-strasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "J.-Bergler Straße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kirchenplatz_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Kirchenplatz",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kremserstrasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Kremser Straße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lindau_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Lindau",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muehltalstrasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Mühltalstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Nagelschmiedgasse",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/obereschneckenbergstrasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "O. Schneckenbergstraße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/oetkersiedlung_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Oetkersiedlung",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Rathaus",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Römerplatz",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schwendistrasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Schwendistraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stadttheater_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Stadttheater",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zahnradfabrik_werk1_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Zahnradfabrik Werk 1",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schanzlbruecke_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Schanzlbrücke",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig1d_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "ZOB Bussteig 1D",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/landrichterstrasse_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Landrichterstraße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rosensteig_3_4baeckerholz_hochstein-zob-achleiten.pdf",
		 "Linie 3/4: Bäckerholz/Hochstein - ZOB - Achleiten",
		 "Rosensteig",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/auerspergstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Auerspergstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/danzigerstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Danziger Straße",
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
		 "Donau-Schwaben Straße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-ernst.-derra-str._5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Dr. Ernst. Derra Straße",
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
		 "Fürstenweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gaissabruecke_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Gaißa Brücke",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gertraudstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Gertraudstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/glockenstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Glockenstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gretli-fuchs-strasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Gretli-Fuchs Straße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/grillenoed_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Grillenöd",
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
		 "Jägerreuth",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kachletstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Kachletstraße",
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
		 "Kohlbruck/Brücke",
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
		 "Kubinstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lambergstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Lambergstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Leopoldstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lueftlbergstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Lüftlbergstraße",
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
		 "Minihofstraße",
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
		 "Pramöd",
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
		 "Sailerwöhr",
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
		 "Schulstraße",
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
		 "Stadtgärtnerei",
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
		 "Wörth",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_5_6kohlbruck-zob-patriching_schaldingl.d.d..pdf",
		 "Linie 5/6: Kohlbruck - ZOB - Patriching/Schalding l.d.D.",
		 "Leopoldstraße",
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
		 "Schellköpfing",
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
		 "Westerburgerstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/auerspergstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Auerspergstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/danzigerstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Danziger Straße",
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
		 "Donau Schwaben Straße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-ernst.-derra-str._5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Dr. Ernst. Derra Straße",
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
		 "Fattingerstraße",
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
		 "Fürstenweg",
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
		 "Gaißa Brücke",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gertraudstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Gertraudstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/glockenstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Glockenstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gretli-fuchs-strasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Gretli Fuchs Straße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/grillenoed_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Grillenöd",
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
		 "Jägerreuth",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kachletstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Kachletstraße",
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
		 "Kraftstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kubinstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Kubinstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lambergstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Lambergstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Leopoldstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lueftlbergstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Lüftlbergstraße",
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
		 "Minihofstraße",
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
		 "Pramöd",
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
		 "Sailerwöhr",
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
		 "Schanzlbrücke",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schulstrasse_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Schulstraße",
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
		 "Westerburgerstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/woerth_5_6patriching_schaldingl.d.d.-zob-kohlbruck.pdf",
		 "Linie 5/6: Patriching/Schalding l.d.D. - ZOB - Kohlbruck",
		 "Wörth",
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
		 "Auerspergstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aeusserespitalhofstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Äußere Spitalhofstraße",
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
		 "Anzengruberstraße",
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
		 "Danziger Straße",
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
		 "Eichendorffstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eichetstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Eichetstraße",
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
		 "Fürstenweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gertraudstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Gertraudstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/glockenstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Glockenstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/grillenoed_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Grillenöd",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/herrmann-woesner-str._7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Auerspergstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/holzmannstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Holzmannstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kraftstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Kraftstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kreuzbergstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Kreuzbergstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lambergstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Lambergstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lautensackstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Lautensackstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Leopoldstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/martin-seitz-strasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Martin Seitz Straße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/max-matheis-strasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Max Matheis Straße",
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
		 "Reinhard Raffalt Straße",
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
		 "Sailerwöhr",
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
		 "Schulstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/senefelderstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Senefelderstraße",
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
		 "Westendstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/westerburgerstrasse_7eichendorffstr.-zob-ries.pdf",
		 "Linie 7: Eichendorffstr. - ZOB - Ries",
		 "Westerburgerstraße",
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
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Auerspergstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/anzengruberstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Anzengruberstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aeusserespitalhofstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Äußere Spitalhofstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/danzigerstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Danzigerstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-geiger-weg_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Dr. Geiger Weg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eggendobl_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Eggendobl",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eichetstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Eichetstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/fuerstenweg_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Fürstenweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gertraudstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Gertraudstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/glockenstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Glockenstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/grillenoed_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Grillenöd",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/herrmann-woesner-str._7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Herrmann Woesner Straße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/holzmannstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Holzmannstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kraftstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Kraftstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kreuzbergstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Kreuzbergstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lambergstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Lambergstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lautensackstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Lautensackstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Leopoldstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/martin-seitz-strasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Martin Seitz Straße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/max-matheis-strasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Max Matheis Strasse",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/neustift_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Neustift",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/plantage_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Plantage",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reinhard-raffalt-strasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Reinhard Raffalt Straße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ries_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Ries",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sailerwoehr_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Sailerwöhr",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schanzlbruecke_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Schanzlbrücke",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schreinerbauerweg_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Schreinerbauerweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schulstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Schulstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/senefelderstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Senefelderstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/westerburgerstrasse_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "Westerburgerstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig2_7ries-zob-eichendorffstr..pdf",
		 "Linie 7: Ries - ZOB - Eichendorffstraße",
		 "ZOB Bussteig 2",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/apfelkoch_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Apfelkoch",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Augustergasse",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Bahnhofstrasse",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/birkhamerstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Birkhamerstraße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/breslauerstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Breslauerstraße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-winklhofer-strasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Dr. Winklhofer Straße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gionstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Gionstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/graf-salm-strasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Graf Salm Straße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gustav-haydn-strasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Gustav Haydn Straße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hacklstein_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Hacklstein",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Hauptbahnhof",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/heining_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Heining",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kachlet_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Kachlet",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/klinikum_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Klinikum",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/koenigsbergerstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Königsbergerstraße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kohlbruck_erlebnisbad_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Kohlbruck / Erlebnisbad PEB",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/oberoederweg_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Oberöderweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/raiffeisenstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Raiffeisenstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteig_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Rittsteig",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schoenleitnerweg_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Schönleitnerweg",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/simmerlingweg_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Simmerlingweg",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/soeldenpeterweg_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Söldenpeterweg",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/steinbachmuehle_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Steinbachmühle",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stelzhamerstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Stelzbachmühle",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stelzhamerstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Stelzhamerstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/universitaet_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Universität",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/vornholz_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Vornholz",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/weinleitenweg_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Weinleitenweg",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/winzerleite_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Winzerleite",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/woerthstrasse_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "Wörthstraße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig3_8_9kohlbruck_erlebnisbad-zob-koenigschalding.pdf",
		 "Linie 8/9: Kohlbruck/Erlebnisbad - ZOB - Königschalding",
		 "ZOB Bussteig 3",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/apfelkoch_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Apfelkoch",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Augustinergasse",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/b.-vonbehr-str._8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Augustinergasse",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Bahnhofstraße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/birkhamerstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Birkhamerstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/breslauerstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Breslauer Straße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eich_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Eich",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gionstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Gionstraße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/graf-salm-strasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Augustinergasse",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hacklstein_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Hacklstein",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Hauptbahnhof",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/heining_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Heining",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/herrmann-woesner-str._8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Herrmann Woesner Straße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hofmannsthalstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Hofmannsthalstraße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kachlet_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Kachlet",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/klinikum_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Klinikum",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/koenigsbergerstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Königsbergerstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/koenigschalding_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Königschalding",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/neustift_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Neustift",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/parkhausbahnhofstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Parkhaus Bahnhofstrasse",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/pater-rupert-mayer-str._8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Pater Rupert Mayer Straße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/raiffeisenstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Raiffeisenstraße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/richterstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Richterstraße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteig_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Rittsteig",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteigerstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Rittsteigerstraße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schoenleitnerweg_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Schönleitnerweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/simmerlingweg_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Simmerlingweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/soeldenpeterweg_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Söldenpeterweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stallerweg_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Stallerweg",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/steinbachmuehle_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Steinbachmühle",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stelzhamerstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Stelzhamerstraße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/universitaet_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Universität",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/vornholz_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Vornholz",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/weinleitenweg_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Weinleitenweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/westendstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Westendstraße",
		 "29.09.2014");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/woerthstrasse_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "Wörthstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig2_8_9koenigschalding-zob-kohlbruck_erlebnisbad.pdf",
		 "Linie 8/9: Königschalding - ZOB - Kohlbruck/Erlebnisbad",
		 "ZOB Bussteig 2",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/buchenstrasse_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Buchenstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Bahnhofstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gartenstrasse_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Gartenstraße",
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
		 "Holzmannstraße",
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
		 "Prügelweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/raiffeisenstrasse_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Raiffeisenstraße",
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
		 "Steinbachmühle",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stelzhamerstrasse_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Stelzhamerstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/westendstrasse_10zob-schaldingr.d.d..pdf",
		 "Linie 10: ZOB - Schalding r.d.D.",
		 "Westendstraße",
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
		 "Buchenstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Bahnhofstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/einoederstrasse_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Einöderstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gartenstrasse_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Gartenstraße",
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
		 "Holzmannstraße",
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
		 "Parkhaus Bahnhofstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/pruegelweg_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Prügelweg",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/raiffeisenstrasse_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Raiffeisenstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reuthingerweg_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Reuthingerstraße",
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
		 "Steinbachmühle",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stelzhamerstrasse_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Stelzhamerstraße",
		 "08.09.2013");
		 allStation.add(bs);
		 bs = new Bushaltestelle(
		 "https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/westendstrasse_10schaldingr.d.d.-zob.pdf",
		 "Linie 10: Schalding r.d.D. - ZOB",
		 "Westendstraße",
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
				"Linie 11: ZOB - Senefelderstr.", "B. von Behr Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/anzengruberstrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Anzengruberstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Bahnhofstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/carossastrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Carossastraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eichendorffstrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Eichendorffstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eichetstrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Eichetstraße", "08.09.2013");
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
				"Linie 11: ZOB - Senefelderstr.", "Lautensackstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/martin-seitz-strasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Martin Seitz Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/raiffeisenstrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Raiffeisenstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reinhard-raffalt-strasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Reinhard Raffalt Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteigerstrasse_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Rittsteigerstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stallerweg_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Stallerweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/steinbachmuehle_11zob-senefelderstr..pdf",
				"Linie 11: ZOB - Senefelderstr.", "Steinbachmühle", "08.09.2013");
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
				"Linie 11: Senefelderstr.- ZOB", "Carossastraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Bahnhofstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/emerenz-meier-str._11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Emerenz Meier Straße", "08.09.2013");
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
				"Linie 11: Senefelderstr.- ZOB", "Parkhaus Bahnhofstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/raiffeisenstrasse_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Raiffeisenstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reinhard-raffalt-strasse_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Reinhard Raffalt Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/senefelderstrasse_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Senefelderstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/steinbachmuehle_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Steinbachmühle", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stelzhamerstrasse_11senefelderstr.-zob.pdf",
				"Linie 11: Senefelderstr.- ZOB", "Stelzhamerstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/anger_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: Lüftlberg - ZOB - Mariahilf-Grenzstation", "Anger", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: Lüftlberg - ZOB - Mariahilf-Grenzstation", "Augustinergasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aumuehlweg_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: Lüftlberg - ZOB - Mariahilf-Grenzstation", "Aumühlweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eggendobl_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: Lüftlberg - ZOB - Mariahilf-Grenzstation", "Eggendobl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/fuerstenweg_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: Lüftlberg - ZOB - Mariahilf-Grenzstation", "Fürstenweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jahnstrasse_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: Lüftlberg - ZOB - Mariahilf-Grenzstation", "Jahnstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kirchenplatz_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: Lüftlberg - ZOB - Mariahilf-Grenzstation", "Kirchenplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lueftlberg_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: Lüftlberg - ZOB - Mariahilf-Grenzstation", "Lüftlberg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/mariahilf-grenzstation_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: Lüftlberg - ZOB - Mariahilf-Grenzstation", "Mariahilf Grenzstation", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/mozartstrasse_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: Lüftlberg - ZOB - Mariahilf-Grenzstation", "Mozartstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muffatstrasse_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: Lüftlberg - ZOB - Mariahilf-Grenzstation", "Muffatstrasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schaerdingerstr._k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: Lüftlberg - ZOB - Mariahilf-Grenzstation", "Schärdingerstr.", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schulstrasse_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: Lüftlberg - ZOB - Mariahilf-Grenzstation", "Schulstrasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stadttheater_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: Lüftlberg - ZOB - Mariahilf-Grenzstation", "Stadttheater", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig4_k1lueftlberg-zob-mariahilf-grenzstation.pdf",
				"Linie K1: Lüftlberg - ZOB - Mariahilf-Grenzstation", "ZOB Bussteig 4", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/anger_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - Lüftlberg", "Anger", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - Lüftlberg", "Augustinergasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzl_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - Lüftlberg", "Am Schanzl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aumuehlweg_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - Lüftlberg", "Aumühlweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eggendobl_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - Lüftlberg", "Eggendobl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jahnstrasse_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - Lüftlberg", "Jahnstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/mariahilf-grenzstation_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - Lüftlberg", "Mariahilf Grenzstation", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/mayrhof_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - Lüftlberg", "Mayrhof", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/mozartstrasse_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - Lüftlberg", "Mozartstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muffatstrasse_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - Lüftlberg", "Muffatstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schaerdingerstr._k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - Lüftlberg", "Schärdingerstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schmiedgasse_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - Lüftlberg", "Schmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schulstrasse_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - Lüftlberg", "Schulstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stadttheater_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - Lüftlberg", "Stadttheater", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig4_k1mariahilf-grenzstation-zob-lueftlberg.pdf",
				"Linie K1: Mariahilf-Grenzstation - ZOB - Lüftlberg", "ZOB Bussteig 4", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Augustinergasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzbruecke_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Ilzbrücke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kirchenplatz_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Kirchenplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/linzerstrasse_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Linzerstraße", "18.11.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muehltalstrasse_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Mühltalstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schanzlbruecke_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Schanzlbrücke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sieglgut_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Sieglgut", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/voglau_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Voglau", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/christdobl_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Christdobl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jahnstrasse_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "jahnstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/klafterbrunnweg_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Klafterbrunnweg", "18.11.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lindenthal1_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Lindenthal 1", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muehltal_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Mühltal", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Römerplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sieglberg_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Sieglberg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stadttheater_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "Stadttheater", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig4_k2sieglberg_sieglgut-zob-muehltal_lindental.pdf",
				"Linie K2: Sieglberg/Sieglgut - ZOB - Mühltal/Lindental", "ZOB Bussteig 4", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: Mühltal/Lindental - ZOB - Sieglberg/Sieglgut", "Augustinergasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzlturm_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: Mühltal/Lindental - ZOB - Sieglberg/Sieglgut", "Am Schanzlturm", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/christdobl_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: Mühltal/Lindental - ZOB - Sieglberg/Sieglgut", "Christdobl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzbruecke_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: Mühltal/Lindental - ZOB - Sieglberg/Sieglgut", "Ilzbrücke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kirchenplatz_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: Mühltal/Lindental - ZOB - Sieglberg/Sieglgut", "Kirchenplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lindenthal2_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: Mühltal/Lindental - ZOB - Sieglberg/Sieglgut", "Lindenthal 2", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muehltal_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: Mühltal/Lindental - ZOB - Sieglberg/Sieglgut", "Mühltal", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muehltalstrasse_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: Mühltal/Lindental - ZOB - Sieglberg/Sieglgut", "Mühltalstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: Mühltal/Lindental - ZOB - Sieglberg/Sieglgut", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: Mühltal/Lindental - ZOB - Sieglberg/Sieglgut", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: Mühltal/Lindental - ZOB - Sieglberg/Sieglgut", "Römerplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schmiedgasse_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: Mühltal/Lindental - ZOB - Sieglberg/Sieglgut", "Schmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stadttheater_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: Mühltal/Lindental - ZOB - Sieglberg/Sieglgut", "Stadttheater", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig4_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: Mühltal/Lindental - ZOB - Sieglberg/Sieglgut", "ZOB Bussteig 4", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zollamtsaming_k2muehltal_lindental-zob-sieglberg_sieglgut.pdf",
				"Linie K2: Mühltal/Lindental - ZOB - Sieglberg/Sieglgut", "Zollamt/Saming", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/apfelkoch_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Apfelkoch", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzlturm_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Am Schanzlturm", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aufischer_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Aufischer", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eduard-hamm-strasse_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Eduard Hamm Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/giselastrasse_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Giselastraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hochstrasse_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Hochstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ingling_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Ingling", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/klinikum_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Klinikum", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Leopoldstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lindau_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Lindau", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Römerplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sulzsteg_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Sulzsteg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/untereschneckenbergstr._k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Untere Schneckenbergstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/untereschneckenbergstr.a_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Untere Schneckenbergstraße A", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/untereschneckenbergstr.b_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Untere Schneckenbergstraße B", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/untereschneckenbergstr.c_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Untere Schneckenbergstraße C", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/woerthstrasse_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "Wörthstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig4_k3klinikum-zob-amhoegl_sulzsteg.pdf",
				"Linie K3: Klinikum - ZOB - Am Högl/Sulzsteg", "ZOB Bussteig 4", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amhoegl_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Am Högl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/apfelkoch_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Apfelkoch", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aufischer_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Aufischer", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eduard-hamm-strasse_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Eduard Hamm Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/giselastrasse_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Giselastraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hochstrasse_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Hochstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/klinikum_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Klinikum", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/leopoldstrasse_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Leopoldstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lindau_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Lindau", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Römerplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schanzlbruecke_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Schanzlbrücke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/sulzsteg_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Sulzsteg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/untereschneckenbergstr.a_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Untere Schneckenbergstraße A", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/untereschneckenbergstr.b_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Untere Schneckenbergstraße B", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/untereschneckenbergstr.c_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Untere Schneckenbergstraße C", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/woerthstrasse_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "Wörthstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig4_k3amhoegl_sulzsteg-zob-klinikum.pdf",
				"Linie K3: Am Högl/Sulzsteg - ZOB - Klinikum", "ZOB Bussteig 4", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aeusserespitalhofstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Äußere Spitalhofstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Bahnhofstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bernhard-setzerstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Bernhard Setzer Straße", "08.09.2013");
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
				"Linie K4: ZOB - Sperrwies", "Danziger Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-geiger-weg_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Dr. Geiger Weg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gutenbergstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Gutenbergstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hammerbachstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Hammerbachstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Hauptbahnhof", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/herrmann-woesner-str._k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Herrmann Woesner Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/holzheimerstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Holzheimerstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/holzmannstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Holzmannstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/johann-riederer-strasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Johann Riederer Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/medienstrasse_k4zob-sperrwies.pdf",
				"Linie K4: ZOB - Sperrwies", "Medienstraße", "08.09.2013");
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
				"Linie K4: Sperrwies - ZOB", "Äußere Spitalhofstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Bahnhofstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bernhard-setzerstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Bernhard Setzer Straße", "08.09.2013");
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
				"Linie K4: Sperrwies - ZOB", "Danziger Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-geiger-weg_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Dr. Geiger Weg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gutenbergstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Gutenbergstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hammerbachstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Hammerbachstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Hauptbahnhof", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/herrmann-woesner-str._k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Herrmann Woesner Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/holzheimerstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Holzheimerstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/holzmannstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Holzmannstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/johann-riederer-strasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Johann Riederer Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/medienstrasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Medienstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/neustift_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Neustift", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/paula-deppe-strasse_k4sperrwies-zob.pdf",
				"Linie K4: Sperrwies - ZOB", "Paula Deppe Straße", "08.09.2013");
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
				"Linie K4: Sperrwies - ZOB", "Westendstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/parkhausbahnhofstrasse_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstraße - ZOB - Römerplatz", "Parkhaus Bahnhofstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzl_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstraße - ZOB - Römerplatz", "Am Schanzl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzlturm_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstraße - ZOB - Römerplatz", "Am Schanzlturm", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstraße - ZOB - Römerplatz", "Bahnhofstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/domplatz_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstraße - ZOB - Römerplatz", "Domplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstraße - ZOB - Römerplatz", "Hauptbahnhof", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathausplatz_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstraße - ZOB - Römerplatz", "Rathausplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/residenzplatz_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstraße - ZOB - Römerplatz", "Residenzplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rindermarkt_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstraße - ZOB - Römerplatz", "Rindermarkt", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig5_citybusparkhausbahnhofstr.-zob-roemerplatz.pdf",
				"Linie CB: Parkhaus Bahnhofstraße - ZOB - Römerplatz", "ZOB Bussteig 5", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hauptbahnhof_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: Römerplatz - ZOB - Parkhaus Bahnhofstraße ", "Hauptbahnhof", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: Römerplatz - ZOB - Parkhaus Bahnhofstraße ", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: Römerplatz - ZOB - Parkhaus Bahnhofstraße ", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: Römerplatz - ZOB - Parkhaus Bahnhofstraße ", "Römerplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schlosserstiege_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: Römerplatz - ZOB - Parkhaus Bahnhofstraße ", "Schlosserstiege", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig5_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: Römerplatz - ZOB - Parkhaus Bahnhofstraße ", "ZOB Bussteig 5", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/bahnhofstrasse_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: Römerplatz - ZOB - Parkhaus Bahnhofstraße ", "Bahnhofstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schanzlbruecke_citybusroemerplatz-zob-parkhausbahnhofstr..pdf",
				"Linie CB: Römerplatz - ZOB - Parkhaus Bahnhofstraße ", "Schanzlbrücke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/abteistrasse_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Abteistraße", "08.09.2013");
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
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Breslauer Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/christdobl_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Christdobl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-emil-brichta-str._1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Dr. Emil Brichta Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/englmeierstrasse_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Englmeierstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/firmiangut_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Firmiangut", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/giselastrasse_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Giselastraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzbruecke_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Ilzbrücke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/josef-wenzl-str._1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Josef Wenzl Straße", "08.09.2013");
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
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Leopoldstraße", "08.09.2013");
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
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Prinz Eugen Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Römerplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schoenleitnerweg_1kohlbruck_erlebnisbad-zob-lindau.pdf",
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Schönleitnerweg", "08.09.2013");
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
				"Linie 1: Kohlbruck / Erlebnisbad PEB - ZOB - Lindau", "Waldschmiedstraße", "08.09.2013");
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
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Breslauer Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/christdobl_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Christdobl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-emil-brichta-str._2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Dr. Emil Brichta Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/englmeierstrasse_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Englmeierstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/giselastrasse_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Giselastraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzbruecke_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Ilzbrücke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/josef-wenzl-str._2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Josef Wenzl Straße", "08.09.2013");
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
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Leopoldstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/prinz-eugen-strasse_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Prinz Eugen Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Römerplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/saeumerweg_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Säumerweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/scharbachweg_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Scharbachweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schoenleitnerweg_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Schönleitnerweg", "08.09.2013");
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
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Waldschmidtstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/wilhelm-niedermayer-str._2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "Wilhelm Niedermayer Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig1ab_2kohlbruck_erlebnisbad-zob-zieglreuth.pdf",
				"Linie 2: Kohlbruck / Erlebnisbad PEB - ZOB - Zieglreuth", "ZOB Bussteig 1 AB", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/achleiten_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Achleiten", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzlturm_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Am Schanzlturm", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/auenweg_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Auenweg", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/aufischer_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Aufischer", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Augustinergasse", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/evangelischekirche_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Evangelische Kirche", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/garhammerweg_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Garhammerweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/haibach_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Haibach", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hoernerweg_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Hörnerweg", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jaegersteig_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Jägersteig", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jesuitenschloessl_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Jesuitenschlössl", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/johann-bergler-strasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Johann Bergler Straße", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kremserstrasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Kremserstraße", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lindau_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Lindau", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muehltalstrasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Mühltalstraße", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/obereschneckenbergstrasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Obere Schneckenbergstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Römerplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schmiedgasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Schmiedgasse", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schwendistrasse_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Schwendistraße", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stadttheater_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Stadttheater", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zahnradfabrik_werk1_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "Zahnradfabrik Werk 1", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig1ab_3achleiten-zob-baeckerholz.pdf",
				"Linie 3: Achleiten - ZOB - Bäckerholz", "ZOB Bussteig 1 AB", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/achatiusstrasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Hochstein", "Achatiusstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/achleiten_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Achleiten", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/amschanzlturm_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Am Schanzlturm", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/auenweg_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Auenweg", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/augustinergasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Augustinergasse", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/christdobl_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Christdobl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/haibach_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Haibach", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hals_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Hals", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/hoernerweg_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Hörnerweg", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzbruecke_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Ilzbrücke", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/ilzleite_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Ilzleite", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/jesuitenschloessl_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Jesuitenschlössl", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/johann-bergler-strasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Johann Bergler Straße", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/kremserstrasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Kremserstraße", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/landrichterstrasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Landrichterstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/muehltalstrasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Mühltalstraße", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/nagelschmiedgasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Nagelschmiedgasse", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/oetkersiedlung_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Oetkersiedlung", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rathaus_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Rathaus", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/roemerplatz_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Römerplatz", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rosensteig_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Rosensteig", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schmiedgasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Schmiedgasse", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/schwendistrasse_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Schwendistraße", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stadttheater_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "Stadttheater", "29.09.2014");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/zobbussteig1ab_4achleiten-zob-hochstein.pdf",
				"Linie 4: Achleiten - ZOB - Bäckerholz", "ZOB Bussteig 1 AB", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/b.-vonbehr-str._78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "B. von Behr Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/buchenstrasse_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Buchenstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-winklhofer-strasse_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Dr. Winklhofer Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gartenstrasse_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Gartenstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gionstrasse_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Gionstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gustav-haydn-strasse_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Gustav Haydn Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/herrmann-woesner-str._78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Herrmann Woesner Straße", "08.09.2013");
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
				"Linie 78: ZOB - Schalding r.d.D.", "Oberöderweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/pruegelweg_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Prügelweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reuthingerweg_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Reuthingerweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/richterstrasse_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Richterstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteig_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Rittsteig", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteigerstrasse_78zob-schaldingr.d.d..pdf",
				"Linie 78: ZOB - Schalding r.d.D.", "Rittsteigerstraße", "08.09.2013");
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
				"Linie 78: Schalding r.d.D. - ZOB", "B. von Behr Straße", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/buchenstrasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Buchenstraße", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/dr.-winklhofer-strasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Dr. Winklhofer Straße", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/einoederstrasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Einöderstraße", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gartenstrasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Gartenstraße", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gionstrasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Gionstraße", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/gustav-haydn-strasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Gustav Haydn Straße", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/herrmann-woesner-str._78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Herrmann Woesner Straße", "08.09.2013");
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
				"Linie 78: Schalding r.d.D. - ZOB", "Oberöderweg", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/pruegelweg_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Prügelweg", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reuthingerweg_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Reuthingerweg", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/richterstrasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Richterstraße", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteig_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Rittsteig", "08.09.2013");
		allStation.add(bs);	
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteigerstrasse_78schaldingr.d.d.-zob.pdf",
				"Linie 78: Schalding r.d.D. - ZOB", "Rittsteigerstraße", "08.09.2013");
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
				"Linie 79: ZOB - Eichendorffstraße", "B. von Behr Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eichetstrasse_79zob-eichendorffstr..pdf",
				"Linie 79: ZOB - Eichendorffstraße", "Eichetstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/martin-seitz-strasse_79zob-eichendorffstr..pdf",
				"Linie 79: ZOB - Eichendorffstraße", "Martin Seitz Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/rittsteigerstrasse_79zob-eichendorffstr..pdf",
				"Linie 79: ZOB - Eichendorffstraße", "Rittsteigerstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/stallerweg_79zob-eichendorffstr..pdf",
				"Linie 79: ZOB - Eichendorffstraße", "Stallerweg", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/anzengruberstrasse_79eichendorffstr.-zob.pdf",
				"Linie 79: Eichendorffstraße - ZOB", "Anzengruberstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/carossastrasse_79eichendorffstr.-zob.pdf",
				"Linie 79: ZOB - Eichendorffstraße", "Carossastraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/eichendorffstrasse_79eichendorffstr.-zob.pdf",
				"Linie 79: ZOB - Eichendorffstraße", "Eichendorffstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/emerenz-meier-str._79eichendorffstr.-zob.pdf",
				"Linie 79: ZOB - Eichendorffstraße", "Emerenz Meier Straße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/lautensackstrasse_79eichendorffstr.-zob.pdf",
				"Linie 79: ZOB - Eichendorffstraße", "Lautensackstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/raiffeisenstrasse_79eichendorffstr.-zob.pdf",
				"Linie 79: ZOB - Eichendorffstraße", "Raiffeisenstraße", "08.09.2013");
		allStation.add(bs);
		bs = new Bushaltestelle(
				"https://www.stadtwerke-passau.de/fileadmin/haltestellen/pdf/reinhard-raffalt-strasse_79eichendorffstr.-zob.pdf",
				"Linie 79: ZOB - Eichendorffstraße", "Reinhard Raffalt Straße", "08.09.2013");
		allStation.add(bs);
	
	}

	public LinkedList<Bushaltestelle> getAllStation() {
		return allStation;
	}

}
