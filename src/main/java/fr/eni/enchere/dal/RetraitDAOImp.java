/**
 * 
 */
package fr.eni.enchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Retrait;
import fr.eni.enchere.dal.util.ConnectionProvider;


/**
 * @author qdeboudt2022
 * 29 mars 2022
 */
public class RetraitDAOImp {
	private final String SELECT = "SELECT no_article, rue, code_postal, ville FROM RETRAITS";
	private final String INSERT = "INSERT INTO RETRAITS (no_article,rue,code_postal,ville) VALUES (?,?,?,?)";
	private final String recupe = "join ARTICLES_VENDUS on RETRAITS.no_article = ARTICLES_VENDUS.no_article";
	
	public void selectNo_article() throws Exception {
		try(Connection con = ConnectionProvider.getConnection()) {
			List<ArticleVendu> result= new ArrayList<ArticleVendu>();
			PreparedStatement stmt = con.prepareStatement(recupe);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				ArticleVendu articleVendu = new ArticleVendu(rs.getInt("no_article"), null, null, null, null, null, null, null, null, null);
				result.add(articleVendu);
			}
			
			
		}catch (SQLException e) {
			throw new Exception("Probleme de Insert -> (RetraitDAOImpl)");
		}
	}
	
	
	
	
	public void insert(Retrait retrait) throws Exception {
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(INSERT);
			PreparedStatement stmt2 = con.prepareStatement(recupe);
			stmt2.setString(1, rs.getInt("no_article")  );
			stmt.setString(2, retrait.getRue());
			stmt.setString(3, retrait.getCode_postal());
			stmt.setString(4, retrait.getVille());
			stmt.executeUpdate();
			
	
		}catch (SQLException e) {
			throw new Exception("Probleme de Insert -> (RetraitDAOImpl)");
		}
	}
	
	
	
	
	public List<Retrait> selectAll() throws Exception {
		List<Retrait> result= new ArrayList<Retrait>();
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Retrait retrait = new Retrait(rs.getInt("no_article"),rs.getString("rue") ,rs.getString("code_postal"),rs.getString("ville") );
				result.add(retrait);
			}
		}catch (SQLException e) {
			throw new Exception("Probleme de select -> (RetraitDAOImpl)");
		}
		return result;
	}
	
	
	
	
	
	

}