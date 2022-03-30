/**
 * 
 */
package fr.eni.enchere.dal;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;

/**
 * Classe en charge de
 * @author sforet2022
 * @date 29 mars 2022
 * @version ENI-Encheres- V0.1
 * @since  29 mars 2022 - 12:01:45
 *
 */
public class ArticleVenduDAOMock implements ArticleVenduDAO {

	private ArticleVendu articleVendu;
	private List<ArticleVendu> lstArticleVendu = new ArrayList<ArticleVendu>();	
	/**
	*{@inheritedDoc}
	*/
	@Override
	public void insert(ArticleVendu articleVendu) {
		lstArticleVendu.add(articleVendu);
	}

	/**
	*{@inheritedDoc}
	*/
	@Override
	public List<ArticleVendu> selectAll() {
		return lstArticleVendu;
	}

	/**
	*{@inheritedDoc}
	*/
	@Override
	public ArticleVendu selectById(int id) throws DalException {
		return articleVendu;
	}

	
	
}
