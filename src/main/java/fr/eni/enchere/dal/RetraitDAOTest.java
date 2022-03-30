/**
 * 
 */
package fr.eni.enchere.dal;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Retrait;

/**
 * @author qdeboudt2022
 * 29 mars 2022
 */
public class RetraitDAOTest {
	private static RetraitDAO dao = DAOFact.getRetraitDAO();

	public static void main(String[] args) throws Exception {
		dao.insert(new Retrait("rue","code_postal","ville"));
		dao.insert(new Retrait("blanche","Bouffay","Blanche"));
		dao.insert(new Retrait("Blonde","Trompe Souris","Blonde"));
		
		dao.selectAll().forEach(System.out::println);
	}

}
