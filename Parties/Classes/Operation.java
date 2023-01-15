Paquet MA. exemple. devoir_ws_xml. Classes;

Importer Java. utilitaire. Date;
Importer Jakarta. XML. lier. annotation. XmlAccessType;
Importer Jakarta. XML. lier. annotation. XmlAccessorType;
Importer Jakarta. XML. lier. annotation. XmlAttribute;

@XmlAccessorType(XmlAccessType. CHAMP)
Fonctionnement de classe  publique {
	
	@XmlAttribute
	type privéType d’opération ;
	@XmlAttribute
	privé Date date;
	@XmlAttribute
	Private Double montant ;
	@XmlAttribute
	description de chaîne  privée;
	
	
	Fonctionnement public () {
	}


	public Operation(TypeType d’opération, Date date, double montant, Description de chaîne ) {
		ce.  type = type;
		ce.  date = date;
		ce.  montant = montant;
		ce.  description = description;
	}


	Public TypeOperation getType() {
		Type de retour;
	}


	public void setType(TypeType d’opération ) {
		ce.  type = type;
	}


	public Date getDate() {
		Date de retour;
	}


	public void setDate(Date date) {
		ce.  date = date;
	}


	public double getMontant() {
		return montant;
	}


	public void setMontant(double montant) {
		ce.  montant = montant;
	}


	public String getDescription() {
		Description du retour ;
	}
	
	


	@Outrepasser
	public String toString () {
		return « \t Type d’opération= » + type + « , date= » + date + « , montant= » + montant + « , description= » + description 
				;
	}


	public void setDescription(Description de la chaîne ) {
		ce.  description = description;
	}
	
	
	

}
