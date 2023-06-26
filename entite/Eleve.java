package fr.eni.ecole.poo.groupeeleves.entite;

import java.util.Date;
import java.util.List;

import fr.eni.ecole.poo.groupeeleves.demonstration.ClasseException;



@SuppressWarnings("unused")
public class Eleve extends Personne implements Comparable<Eleve>, Responsable{
	private Parent referent;
 
	public Eleve() {
		super();
	}

	public Eleve(String nom, String prenom, String adresse, Date ddn) {
		super(nom, prenom, adresse, ddn);
		
	}
	//--------------METHODE getReferent(); ------- //
	public Parent getReferent(){
		
		return referent;
	}
	//--------------METHODE setReferent(Parent referent); --- //
	public void setReferent(Parent referent) {
		this.referent = referent;
	}
	//-------------------------METHODE toString(); ------- //
	@Override
	public String toString() {
		return "Eleve [referent=" + referent + "]";
	}
	//-------------------------METHODE compareTo(Eleve e); ---- //
	@Override
	public int compareTo(Eleve e) {		
		return this.getPrenom().compareTo(e.getPrenom()); 
	}

	@Override
	public void getNiveau() {
		
		
	}
	


}
