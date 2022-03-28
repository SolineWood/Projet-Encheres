package fr.eni.enchere.bo;

public class Retrait {
	
	private String rue;
	private Integer code_postal;
	private String ville;
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
	public Retrait(String rue, Integer code_postal, String ville) {
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
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
	public Integer getCode_postal() {
		return code_postal;
	}
	/**
	 * @param code_postal the code_postal to set
	 */
	public void setCode_postal(Integer code_postal) {
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
