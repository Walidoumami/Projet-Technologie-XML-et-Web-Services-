Paquet MA. exemple. devoir_ws_xml. Classes;

Importer Java. utilitaire. Liste des tableaux;
Importer Java. utilitaire. Date;
Importer Java. utilitaire. Liste;
Importer Jakarta. XML. lier. annotation. XmlAccessType;
Importer Jakarta. XML. lier. annotation. XmlAccessorType;
Importer Jakarta. XML. lier. annotation. XmlAttribute;
Importer Jakarta. XML. lier. annotation. XmlElement;

@XmlAccessorType(XmlAccessType. CHAMP)
Opérations de classe  publique {

	@XmlAttribute
	date privée  dateDebut;
	
	@XmlAttribute
	privé Date dateFin;
	
	@XmlElement(name="opération »)
	opérations < > de liste privée ;
	
	
	
	Opérations publiques () {
	}

	opérations publiques(Date dateDebut, Date dateFin) {
		
		ce. dateDebut = dateDebut;
		ce. dateFin = dateFin;
		ce. operations = new ArrayList<>();
	}

	public Date getDateDebut() {
		date de retourDébut ;
	}

	public void setDateDebut(Date dateDebut) {
		ce. dateDebut = dateDebut;
	}

	public Date getDateFin() {
		 date de retourFin;
	}

	public void setDateFin(Date dateFin) {
		ce. dateFin = dateFin;
	}

	public List<Operation> getOperations() {
		Opérations de retour ;
	}

	public void setOperations(List<Operation> opérations) {
		ce.  opérations = opérations;
	}
	
	public void addOperation(opération d’opération) {
		ce. opérations. add(opération);
	}

	@Outrepasser
	public String toString () {
		return « Operations \n\t\t dateDebut= » + dateDebut + « \n\t\t dateFin= » + dateFin + « \n\t » ;
	}
	
	
	
	
	
	

}
