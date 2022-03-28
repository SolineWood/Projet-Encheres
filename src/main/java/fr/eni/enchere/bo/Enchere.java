package fr.eni.enchere.bo;

import java.time.LocalDate;

public class Enchere {
	private LocalDate dateEnchere;
	private Integer montant_enchere;
	
	 
	/**
	 * 
	 */
	public Enchere() {
	}


	/**
	 * @param dateEnchere
	 * @param montant_enchere
	 */
	public Enchere(LocalDate dateEnchere, Integer montant_enchere) {
		this.dateEnchere = dateEnchere;
		this.montant_enchere = montant_enchere;
	}


	/**
	 * @return the dateEnchere
	 */
	public LocalDate getDateEnchere() {
		return dateEnchere;
	}


	/**
	 * @param dateEnchere the dateEnchere to set
	 */
	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}


	/**
	 * @return the montant_enchere
	 */
	public Integer getMontant_enchere() {
		return montant_enchere;
	}


	/**
	 * @param montant_enchere the montant_enchere to set
	 */
	public void setMontant_enchere(Integer montant_enchere) {
		this.montant_enchere = montant_enchere;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enchere [");
		if (dateEnchere != null) {
			builder.append("dateEnchere=");
			builder.append(dateEnchere);
			builder.append(", ");
		}
		if (montant_enchere != null) {
			builder.append("montant_enchere=");
			builder.append(montant_enchere);
		}
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
