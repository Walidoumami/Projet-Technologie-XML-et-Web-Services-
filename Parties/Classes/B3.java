Paquet MA. exemple. devoir_ws_xml;

Importer Java. io. Lime;
Importer Java. utilitaire. Date;

Importer Jakarta. XML. lier. JAXBContext;
Importer Jakarta. XML. lier. JAXBException;
Importer Jakarta. XML. lier. Maréchal;
Importer ma. exemple. devoir_ws_xml. classes. Opération;
Importer ma. exemple. devoir_ws_xml. classes. Opérations;
Importer ma. exemple. devoir_ws_xml. classes. Relevé;
Importer ma. exemple. devoir_ws_xml. classes. TypeOpération;

Question_B3 de classe  publique 
{
    public static void main( String[] args ) lève JAXBException
    {
    	JAXBContext j = JAXBContext. newInstance(Releve. .class);
    	
        Releve releve = new  Releve(« 011112222333344445555666 », new Date(), 200000.0 );
		
		 Opérations opérations = nouvelles opérations(nouvelle Date(),nouvelle Date ());

		Opération op1 = nouvelle Opération(TypeOpération. CREDIT, new Date(), 9000.0, « Vers Espèce »);
		Opération op2 = nouvelle Opération(TypeOpération. DEBIT , new Date(), 3400.0, « Chèque Guichet »);
		Opération op3 = nouvelle opération(TypeOpération. DEBIT , nouvelle Date(), 120.0, « Prélèvement Assurence »);
		Opération op4 = nouvelle Opération(TypeOpération. CREDIT, new Date(), 70000.0, « Virement »);
		
		opérations. addOperation(op1);
		opérations. addOperation(op2);
		opérations. addOperation(op3);
		opérations. addOpération(op4);
		
		releve. setOperations(opérations);
		
		Marshaller marshaller = j. createMarshaller();
		Maréchaleur. setProperty(Marshaller. JAXB_FORMATTED_OUTPUT, vrai);
		Maréchaleur. marshal(releve, new File(« releve.xml »));

    }
}
