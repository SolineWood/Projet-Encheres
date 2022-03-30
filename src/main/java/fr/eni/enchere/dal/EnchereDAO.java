/**
 * 
 */
package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Enchere;

/**
 * Classe en charge de
 * @author sforet2022
 * @date 30 mars 2022
 * @version ENI-Encheres- V0.1
 * @since  30 mars 2022 - 16:07:22
 *
 */
public interface EnchereDAO {
	
	public void insert (Enchere enchere) throws DalException;
	public List<Enchere> selectAll() throws DalException;
	
}
