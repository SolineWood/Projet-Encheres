package fr.eni.enchere.dal;


public class DAOFact {
	
	public static utilisateurDAO getUtilisateurDAO() {
		return new utilisateurDAOImpl();
	}
	
}
