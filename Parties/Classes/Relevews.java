Paquet MA. exemple. devoir_ws_xml. Classes;

Importer Java. utilitaire. Date;

Importer Jakarta. JWS. WebMéthode;
Importer Jakarta. JWS. WebParam;
Importer Jakarta. JWS. Service Web;

@WebService(serviceName = « releveWs »)
classe publique  ReleveWs {
	
	@WebMethod(operationName = « getReleve »)
	public Releve getReleve() {
		
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
		
		Retour Releve;
	}
	
	@WebMethod(operationName = « getReleveByRib »)
	public Releve getReleveByRib(@WebParam(name = « rib ») String rib) {
		return null;
	}
}
