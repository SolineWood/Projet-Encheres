package fr.eni.enchere.dal;

import fr.eni.enchere.bo.Utilisateur;

public class testUtilisateurDal {

	public static void main(String[] args) throws DalException {
		utilisateurDAOMock bddMock=new utilisateurDAOMock();
		Utilisateur utilisateur=new Utilisateur(1,"pseudo","nom","prenom","email","telephone","rue",35700,"ville","motDePasse",(float) 1000,"administrateur");
		bddMock.insertUtilisateur(utilisateur,"");
	}

}
