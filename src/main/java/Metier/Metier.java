package Metier;

import DAO.DAOLivre;
import Entities.Livre;

public class Metier
{
DAOLivre DAOL= new DAOLivre();
public void ajouter(Livre L)
{
	DAOL.ajouterLivre(L);
	}
}
