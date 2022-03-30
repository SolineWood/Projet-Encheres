/**
 * 
 */
package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;

/**
 * Classe en charge de
 * @author sforet2022
 * @date 29 mars 2022
 * @version ENI-Encheres- V0.1
 * @since  29 mars 2022 - 11:53:23
 *
 */
public interface ArticleVenduDAO {
	
	public void insert (ArticleVendu articleVendu) throws DalException;
	public List<ArticleVendu> selectAll() throws DalException;
	public ArticleVendu selectById (int id) throws DalException;

}
