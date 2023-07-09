package Utility ;
import java.sql.Connection ;
import DAO.DAOLivre ;
import DAO.IDAOLivre ;
import Entities.Livre;
import Utility.SingletonConnection ;
public class Test
	{
		public static void main(String[] args)
			{
				Connection MyCon = SingletonConnection.getConnection() ;
				Livre V = new Livre(1 , "Java" , 35 , "Wael") ;
				IDAOLivre DAOV = new DAOLivre() ;
				DAOV.ajouterLivre(V) ;
				System.out.println("\nLivre ajouté") ;
			}
	}