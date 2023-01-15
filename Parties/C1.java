Paquet MA. exemple. devoir_ws_xml;

Importer Jakarta. XML. ws. Extrémité;
Importer ma. exemple. devoir_ws_xml. classes. ReleveWs;

Question_C1 de classe  publique {

	public static void main(String[] args) {
		
		Point de terminaison. publish(« http://0.0.0.0:9191/ », new ReleveWs());
		Système. dehors. println(« le webService est bien deploye »);

	}

}
