package fr.eni.enchere.bo;


public class Utilisateur {

	private Integer noUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private Integer codePostal;
	private String ville;
	private String motDePasse;
	private Integer credit;
	private String administrateur;

	/**
	 * Constructeur.
	 */
	public Utilisateur() {
		super();
	}

	public Utilisateur(Integer noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone,
			String rue, Integer codePostal, String ville, String motDePasse, Integer crédis, String administrateur) {
		
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = crédis;
		this.administrateur = administrateur;
	}

	
	
	public Integer getNoUtilisateur() {
		return noUtilisateur;
	}

	
	public void setNoUtilisateur(Integer noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public Integer getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public String getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(String administrateur) {
		this.administrateur = administrateur;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Utilisateur [");
		if (noUtilisateur != null) {
			builder.append("noUtilisateur=");
			builder.append(noUtilisateur);
			builder.append(", ");
		}
		if (pseudo != null) {
			builder.append("pseudo=");
			builder.append(pseudo);
			builder.append(", ");
		}
		if (nom != null) {
			builder.append("nom=");
			builder.append(nom);
			builder.append(", ");
		}
		if (prenom != null) {
			builder.append("prenom=");
			builder.append(prenom);
			builder.append(", ");
		}
		if (email != null) {
			builder.append("email=");
			builder.append(email);
			builder.append(", ");
		}
		if (telephone != null) {
			builder.append("telephone=");
			builder.append(telephone);
			builder.append(", ");
		}
		if (rue != null) {
			builder.append("rue=");
			builder.append(rue);
			builder.append(", ");
		}
		if (codePostal != null) {
			builder.append("codePostal=");
			builder.append(codePostal);
			builder.append(", ");
		}
		if (ville != null) {
			builder.append("ville=");
			builder.append(ville);
			builder.append(", ");
		}
		if (motDePasse != null) {
			builder.append("motDePasse=");
			builder.append(motDePasse);
			builder.append(", ");
		}
		if (credit != null) {
			builder.append("credit=");
			builder.append(credit);
			builder.append(", ");
		}
		if (administrateur != null) {
			builder.append("administrateur=");
			builder.append(administrateur);
		}
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	
	
	
	
	
	
}
