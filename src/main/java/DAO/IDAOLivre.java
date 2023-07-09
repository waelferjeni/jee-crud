package DAO;

import java.util.List;

import Entities.Livre;

public interface IDAOLivre 
{
	
 public void ajouterLivre(Livre L);

void ModifierLivre(Livre L);

List<Livre> ListerLivres();

void SupprimerLivre( int Ref);

}
