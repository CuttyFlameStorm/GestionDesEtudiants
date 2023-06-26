/**
 * 
 */
package fr.eni.ecole.poo.groupeeleves.entite;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.poo.groupeeleves.demonstration.BusException;
import fr.eni.ecole.poo.groupeeleves.demonstration.ClasseException;

/**
 * @author ssoeun2023
 *
 */
public class Bus extends Personne{
	int nbPlaceMax;
	private List<Personne> lstPersonnes = new ArrayList<Personne>(); // fleche UML vers Personnes
	Personne p;
	
	//-----------------constructor sans paramètre ----//
	public Bus() {		
	}
	//----------------- constructor avec PARAMETRE -- //
	public Bus(int nbPlaceMax){
		super();
		this.nbPlaceMax = nbPlaceMax;
	}
	
	
	/*
	 * Getters et Setters
	 */
	//--------------METHODE getNbPlaceMax(); ------- //
	public int getNbPlaceMax() {
		return nbPlaceMax;
		}
	//--------------METHODE setNbPlaceMax(); --------//
	public void setNbPlaceMax(int nbPlaceMax) {
		this.nbPlaceMax = nbPlaceMax;
	}
	//--------------METHODE getLstPersonnes(); ---Récupere une liste de personne-----//
	public List<Personne> getLstPersonnes() {
		return lstPersonnes;
	}
	//--------------METHODE setLstPersonnes(); ---Modifie une liste de personne-----//
	public void setLstPersonnes(List<Personne> lstPersonne) {
		this.lstPersonnes = lstPersonne;
	}
	public void addPersonne(Personne p) throws BusException{
		try {
		this.p = p;	
		} catch(Exception ex) {
			System.out.println("ERROR impossible d'ahouter un eleve dans ce b");
		}
		this.p = p;	
		
	}
	public Bus afficherResponsable(){
		System.out.println("");
	}
	

}
