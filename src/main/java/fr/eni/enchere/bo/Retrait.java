package fr.eni.enchere.bo;

public class Retrait {
	
	private String rue;
	private String code_postal;
	private String ville;
	private ArticleVendu articleVendu;
	/**
	 * 
	 */
	public Retrait() {
	}
	/**
	 * @param rue
	 * @param code_postal
	 * @param ville
	 */
	public Retrait(String rue, String code_postal, String ville) {
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
	}
	
	/**
	 *Constructeur
	 * @param rue
	 * @param code_postal
	 * @param ville
	 * @param articleVendu
	 */
	public Retrait(String rue, String code_postal, String ville, ArticleVendu articleVendu) {
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
		this.articleVendu = articleVendu;
	}
	
	/**
	 * @return the articleVendu
	 */
	public ArticleVendu getArticleVendu() {
		return articleVendu;
	}
	/**
	 * @param articleVendu the articleVendu to set
	 */
	public void setArticleVendu(ArticleVendu articleVendu) {
		this.articleVendu = articleVendu;
	}
	/**
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}
	/**
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}
	/**
	 * @return the code_postal
	 */
	public String getCode_postal() {
		return code_postal;
	}
	/**
	 * @param code_postal the code_postal to set
	 */
	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Retrait [");
		if (rue != null) {
			builder.append("rue=");
			builder.append(rue);
			builder.append(", ");
		}
		if (code_postal != null) {
			builder.append("code_postal=");
			builder.append(code_postal);
			builder.append(", ");
		}
		if (ville != null) {
			builder.append("ville=");
			builder.append(ville);
		}
		builder.append("]");
		return builder.toString();
	}
	

}
