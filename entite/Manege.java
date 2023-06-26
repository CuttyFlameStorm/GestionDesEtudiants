package fr.eni.ecole.poo.groupeeleves.entite;

import java.util.ArrayList;
import java.util.List;

public class Manege<T extends Responsable> {
	private String nom;
	private List<T> lstParticipants = new ArrayList<T>();
	
		public Manege() {			
		}
		public Manege(String nom) {
			this.nom = nom;
		}
	
		public void addParticipant(T participant) {
			lstParticipants.add(participant);
		}
		//--------------  Ajout des getters et setters - //
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public List<T> getLstParticipants() {
			return lstParticipants;
		}
		public void setLstParticipants(List<T> lstParticipants) {
			this.lstParticipants = lstParticipants;
		}
		//---------------  Ajout du toString -------------- //
		@Override
		public String toString() {
			return "Manege [nom=" + nom + ", lstParticipants=" + lstParticipants + ", getNom()=" + getNom()
					+ ", getLstParticipants()=" + getLstParticipants() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		

}
