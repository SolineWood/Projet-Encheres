package fr.eni.enchere.dal;

/**
 * @author qdeboudt2022
 * 29 mars 2022
 */
public class DAOFact {
	public static RetraitDAO getRetraitDAO() {
		return new RetraitDAOImp();
	}
	
	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOImpl();
	}
	
	/*public static ArticleVenduDAO getArticleVenduDAO() {
		return new ArticleVenduDAOImpl();
	}*/

}

