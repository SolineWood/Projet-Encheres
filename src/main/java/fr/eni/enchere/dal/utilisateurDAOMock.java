package fr.eni.enchere.dal;

import java.util.ArrayList;
import java.util.List;
import fr.eni.enchere.bo.Utilisateur;


public class utilisateurDAOMock implements utilisateurDAO{
	
	private static Integer cpt=0;
	private List<Utilisateur> listeUtilisateur = new ArrayList<>();
	
	@Override
	public void insert(Utilisateur utilisateur) {
		utilisateur.setNoUtilisateur(cpt++);
		listeUtilisateur.add(utilisateur);
	}

	@Override
	public List<Utilisateur> selectAll() {
		return listeUtilisateur;
	}
	
	
}
