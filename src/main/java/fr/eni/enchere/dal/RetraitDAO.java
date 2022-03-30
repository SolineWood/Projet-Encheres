/**
 * 
 */
package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Retrait;

/**
 * @author qdeboudt2022
 * 29 mars 2022
 */
public interface RetraitDAO {
	public void insert(Retrait retrait) throws Exception;
	public List<Retrait> selectAll() throws Exception;
	
}
