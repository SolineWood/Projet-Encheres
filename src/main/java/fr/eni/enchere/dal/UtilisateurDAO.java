package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.Utilisateur;

public interface UtilisateurDAO {
	public void insert(Utilisateur utilisateur) throws DalException;
	public List<Utilisateur> selectAll() throws DalException;
	public Integer selectById(Integer id);
}
