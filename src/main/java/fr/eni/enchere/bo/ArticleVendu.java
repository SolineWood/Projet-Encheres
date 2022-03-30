package fr.eni.enchere.bo;

import java.time.LocalDate;
import java.util.List;

public class ArticleVendu {
	
	private Integer noArticle;
	private String nomArticle;
	private String description;
	private LocalDate dateDebutEncheres;
	private LocalDate dateFinEncheres;
	private Integer miseAPrix;
	private Integer prixVente;
	private String etatVente;
	private Utilisateur utilisateur;
	private Categorie categorie;
	private Retrait lieuRetrait;
	private List<Enchere> lstEncheres;
	
	/**
	 * Constructeur.
	 */
	public ArticleVendu() {
		super();
	}

	/**
	 * Constructeur.
	 * @param noArticle
	 * @param nomArticle
	 * @param description
	 * @param dateDebutEncheres
	 * @param dateFinEncheres
	 * @param miseAPrix
	 * @param prixVente
	 * @param etatVente
	 * @param utilisateur
	 * @param categorie
	 * @param lieuRetrait
	 * @param lstEncheres
	 */
	public ArticleVendu(Integer noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, Integer miseAPrix, Integer prixVente, String etatVente, Utilisateur utilisateur,
			Categorie categorie, Retrait lieuRetrait, List<Enchere> lstEncheres) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.utilisateur = utilisateur;
		this.categorie = categorie;
		this.lieuRetrait = lieuRetrait;
		this.lstEncheres = lstEncheres;
	}

	/**
	 * Constructeur.
	 * @param noArticle
	 * @param nomArticle
	 * @param description
	 * @param dateDebutEncheres
	 * @param dateFinEncheres
	 * @param miseAPrix
	 * @param prixVente
	 * @param utilisateur
	 * @param categorie
	 */
	public ArticleVendu(Integer noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, Integer miseAPrix, Integer prixVente, Utilisateur utilisateur,
			Categorie categorie) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.utilisateur = utilisateur;
		this.categorie = categorie;
	}
	
	/**
	 * Constructeur.
	 * @param noArticle
	 * @param nomArticle
	 * @param description
	 * @param dateDebutEncheres
	 * @param dateFinEncheres
	 * @param miseAPrix
	 * @param prixVente
	 */
	public ArticleVendu(Integer noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, Integer miseAPrix, Integer prixVente) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
	}

	public Integer getNoArticle() {
		return noArticle;
	}

	public String getNomArticle() {
		return nomArticle;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getDateDebutEncheres() {
		return dateDebutEncheres;
	}

	public LocalDate getDateFinEncheres() {
		return dateFinEncheres;
	}

	public Integer getMiseAPrix() {
		return miseAPrix;
	}

	public Integer getPrixVente() {
		return prixVente;
	}

	public String getEtatVente() {
		return etatVente;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public Retrait getLieuRetrait() {
		return lieuRetrait;
	}

	public List<Enchere> getLstEncheres() {
		return lstEncheres;
	}

	public void setNoArticle(Integer noArticle) {
		this.noArticle = noArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDateDebutEncheres(LocalDate dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}

	public void setDateFinEncheres(LocalDate dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}

	public void setMiseAPrix(Integer miseAPrix) {
		this.miseAPrix = miseAPrix;
	}

	public void setPrixVente(Integer prixVente) {
		this.prixVente = prixVente;
	}

	public void setEtatVente(String etatVente) {
		this.etatVente = etatVente;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public void setLieuRetrait(Retrait lieuRetrait) {
		this.lieuRetrait = lieuRetrait;
	}

	public void setLstEncheres(List<Enchere> lstEncheres) {
		this.lstEncheres = lstEncheres;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArticleVendu [");
		if (noArticle != null) {
			builder.append("noArticle=");
			builder.append(noArticle);
			builder.append(", ");
		}
		if (nomArticle != null) {
			builder.append("nomArticle=");
			builder.append(nomArticle);
			builder.append(", ");
		}
		if (description != null) {
			builder.append("description=");
			builder.append(description);
			builder.append(", ");
		}
		if (dateDebutEncheres != null) {
			builder.append("dateDebutEncheres=");
			builder.append(dateDebutEncheres);
			builder.append(", ");
		}
		if (dateFinEncheres != null) {
			builder.append("dateFinEncheres=");
			builder.append(dateFinEncheres);
			builder.append(", ");
		}
		if (miseAPrix != null) {
			builder.append("miseAPrix=");
			builder.append(miseAPrix);
			builder.append(", ");
		}
		if (prixVente != null) {
			builder.append("prixVente=");
			builder.append(prixVente);
			builder.append(", ");
		}
		if (etatVente != null) {
			builder.append("etatVente=");
			builder.append(etatVente);
			builder.append(", ");
		}
		if (utilisateur != null) {
			builder.append("utilisateur=");
			builder.append(utilisateur);
			builder.append(", ");
		}
		if (categorie != null) {
			builder.append("categorie=");
			builder.append(categorie);
			builder.append(", ");
		}
		if (lieuRetrait != null) {
			builder.append("lieuRetrait=");
			builder.append(lieuRetrait);
			builder.append(", ");
		}
		if (lstEncheres != null) {
			builder.append("lstEncheres=");
			builder.append(lstEncheres);
		}
		builder.append("]");
		return builder.toString();
	}
	
}