Paquet MA. exemple. devoir_ws_xml;

Importer Java. io. Lime;

Importer Jakarta. XML. lier. JAXBContext;
Importer Jakarta. XML. lier. JAXBException;
Importer Jakarta. XML. lier. Unmarshaller;
Importer ma. exemple. devoir_ws_xml. classes. Relevé;

Question_B4 de classe  publique {

	public static void main(String[] args) lève JAXBException {
		
		JAXBContext j = JAXBContext. newInstance(Releve. .class);
		Unmarshaller unmarshaller = j. createUnmarshaller();
		Releve releve = (Releve) unmarshaller. unmarshal(new File(« releve.xml »));
		
		Système. dehors. println(releve. toString());

	}

}
