/**
 * 
 */
package fr.eni.enchere.dal;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Retrait;

/**
 * @author qdeboudt2022
 * 29 mars 2022
 */
public class RetraitDAOMock implements RetraitDAO {
	private List<Retrait> lstRetrait = new ArrayList<>();
	
	
	@Override
	public void insert(Retrait retrait) throws Exception {
		lstRetrait.add(retrait);
	}

	@Override
	public List<Retrait> selectAll() throws Exception {
		return lstRetrait;
	}

	

	
}
