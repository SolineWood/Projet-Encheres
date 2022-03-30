package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.Utilisateur;

public interface utilisateurDAO {
	
	//insert un utilisateur et son son mot de passe dans la bdd , aprés inscription
	//public void insertUtilisateur( Utilisateur utilisateur) ;
	public List<Utilisateur> selectAll() throws DalException;
	public void insert(Utilisateur utilisateur) throws DalException;

	
}
