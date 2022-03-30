package fr.eni.enchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.util.ConnectionProvider;


public class utilisateurDAOImpl implements utilisateurDAO{
	
	private final String SELECT = "SELECT idBiere, nom, brasserie, couleur FROM biere";
	private final String INSERT = "INSERT INTO biere (nom,brasserie,couleur) VALUES (?,?,?)";
	
	@Override
	public void insert(Utilisateur utilisateur) throws DalException {//comunication directe avec la bdd ou mock apres le controle bll dans addBierre()
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, utilisateur.getNoUtilisateur());
			stmt.setString(2, utilisateur.getPseudo());
			stmt.setString(3, utilisateur.getNom());
			stmt.setString(4, utilisateur.getPrenom());
			stmt.setString(5, utilisateur.getEmail());
			stmt.setString(6, utilisateur.getTelephone());
			stmt.setString(7, utilisateur.getRue());
			stmt.setInt(8, utilisateur.getCodePostal());
			stmt.setString(9, utilisateur.getVille());
			stmt.setString(10, utilisateur.getMotDePasse());
			stmt.setFloat(11, utilisateur.getCredit());
			stmt.setString(5, utilisateur.getAdministrateur());
			int nb = stmt.executeUpdate();
			if(nb>0) {
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next()) {
					utilisateur.setNoUtilisateur(rs.getInt(1));
				}
			}
		}catch (SQLException e) {
			throw new DalException("Probl�me de Insert");
		}
	}

	
	

	@Override
	public List<Utilisateur> selectAll() throws DalException {
		List<Utilisateur> result= new ArrayList<Utilisateur>();
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Utilisateur utilisateur = new Utilisateur(rs.getInt("noUtilisateur"),rs.getString("pseudo") ,rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getString("telephone"),rs.getString("rue"),rs.getInt("codePostal"),rs.getString("ville"),rs.getString("motDePasse"),rs.getFloat("credit"),rs.getString("administrateur"));
				utilisateur.setNoUtilisateur(rs.getInt("noUtilisateur"));
				result.add(utilisateur);
			}
		}catch (SQLException e) {
			throw new DalException("Probl�me de select");
		}
		return result;
	}

	

	

	
}