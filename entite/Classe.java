package fr.eni.ecole.poo.groupeeleves.entite;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import fr.eni.ecole.poo.groupeeleves.demonstration.BusException;
import fr.eni.ecole.poo.groupeeleves.demonstration.ClasseException;

@SuppressWarnings("unused")
public class Classe extends Personne implements Comparable<Personne>{

	private String nom; 
	private Instituteur instituteur;
	private List<Eleve> lstEleves = new ArrayList<>();
	
	
	// --------------CONSTRUCTEUR sans paramètre-----------------
	public Classe(){
		
	}
	//--------------CONSTRUCTEUR---------------------------------
	public Classe(String nom) {    //Class Classe avec paramètre
		this.nom = nom;
	}
	
	//-----------------------------------------------------------
	@Override
	public int compareTo(Personne o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/****METHODE***/// Type void + Type Class Eleve 
	public void addEleve(Eleve e) {
		lstEleves.add(e);
	}
	//--------------------
	public void removeEleve(Eleve e) {
		lstEleves.remove(e);
	}
	//--------------------
	public Eleve getEleve(Integer i) throws ClasseException{
		Eleve e = null;
		String exMessage = "depassement du tableau d'index " + lstEleves.size() + " élèves";
		try {
			e = lstEleves.get(i);
		} catch (IndexOutOfBoundsException ex){
			throw new ClasseException(exMessage);
		}
		return e;
		
	}
	//--------------------
	public void sortListEleve() {
	Collections.sort(lstEleves);
	}
	//--------------------
	public List<Eleve> getLstEleves() {
		return lstEleves;
	}
	//--------------------
	public void setLstEleves(List<Eleve> lstEleves) {
		this.lstEleves = lstEleves;
	}
	//--------------------
	public List<Parent> getListParent(){
		List<Parent> parents = new ArrayList<Parent>();
		
		for (Eleve eleve : lstEleves) {
			Parent p = eleve.getReferent();
			if ((p != null) && (!parents.contains(p))) {	
				parents.add(p);
			}
		}
		return parents;
	}

	//--------------------
	public String getNom() {
		return nom;
	}
	//--------------------
	public void setNom(String nom) {
		this.nom = nom;
	}
	//--------------------
	public Instituteur getInstituteur(){	
		return instituteur;
	}
	//--------------------
	public void setInstituteur(Instituteur instituteur) {
		this.instituteur = instituteur;
	}
	
	
	
	
	
}

