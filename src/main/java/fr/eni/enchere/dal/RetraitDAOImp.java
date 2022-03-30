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
public class RetraitDAOImp implements RetraitDAO {
	private final String SELECT = "SELECT rue, code_postal, ville FROM RETRAITS" 
				+ " join ARTICLES_VENDUS on RETRAITS.no_article = ARTICLES_VENDUS.no_article";
	
	private final String INSERT = "INSERT INTO RETRAITS (no_article,rue,code_postal,ville) VALUES (?,?,?,?)";
	
	public void insert(Retrait retrait) throws Exception {
		ArticleVendu articleVendu = new ArticleVendu();
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(INSERT);
			stmt.setInt(1, articleVendu.getNoArticle());
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
				Retrait retrait = new Retrait();
				retrait.setRue(rs.getString("rue"));
				retrait.setCode_postal(rs.getString("code_postal"));
				retrait.setVille(rs.getString("ville"));
		
				ArticleVendu articleVendu = new ArticleVendu();
				articleVendu.setNoArticle(rs.getInt("no_article"));
				
				retrait.setArticleVendu(articleVendu);
				result.add(retrait);
			}
		}catch (SQLException e) {
			throw new Exception("Probleme de select -> (RetraitDAOImpl)");
		}
		return result;
	}

}
