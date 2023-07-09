package DAO ;
import java.sql.Connection ;
import java.sql.PreparedStatement ;
import java.sql.ResultSet;
import java.sql.SQLException ;
import java.util.ArrayList;
import java.util.List;

import Entities.Livre;
import Utility.SingletonConnection ;
public class DAOLivre implements IDAOLivre
	{
		@Override
		public void ajouterLivre(Livre L)
			{
				Connection Con = SingletonConnection.getConnection() ;
				try
					{ 
						PreparedStatement PS = Con.prepareStatement("INSERT INTO livre (id , titre , pu , auteur) VALUES (? , ? , ? , ?) ;") ;
						PS.setInt(1, L.getRef()) ;
						PS.setString(2, L.getTitre()) ;
						PS.setFloat(3, L.getPrixUnitaire()) ;
						PS.setString(4, L.getAuteur()) ;
						PS.executeUpdate() ;
						PS.close() ;
					}
				catch(SQLException E)
					{
						E.printStackTrace() ;
					}
			}
		@Override
		public void ModifierLivre(Livre L)
			{
				Connection Con = SingletonConnection.getConnection() ;
				try
					{ 
						PreparedStatement PS = Con.prepareStatement("UPDATE livre SET titre = ? , pu = ? WHERE id = ? ;") ;
						PS.setString(1, L.getTitre()) ;
						PS.setFloat(2,L.getPrixUnitaire()) ;
						PS.setFloat(3, L.getPrixUnitaire()) ;
						PS.setInt(4 , L.getRef()) ;
						PS.executeUpdate() ;
						PS.close() ;
					}
				catch(SQLException E)
					{
						E.printStackTrace() ;
					}
			}
		@Override
		public void SupprimerLivre(int Ref)
			{
				Connection Con = SingletonConnection.getConnection() ;
				try
					{ 
						PreparedStatement PS = Con.prepareStatement("DELETE FROM livre WHERE id = ? ;") ;
						PS.setInt(1 , Ref) ;
						PS.executeUpdate() ;
						PS.close() ;
					}
				catch(SQLException E)
					{
						E.printStackTrace() ;
					}
			}
		@Override
		public List<Livre> ListerLivres()
			{
				Connection Con = SingletonConnection.getConnection() ;
				List<Livre> LL = new ArrayList<Livre>() ;
				try
					{
						PreparedStatement PS = Con.prepareStatement("SELECT * FROM livre ;") ;
						ResultSet RS = PS.executeQuery() ;
						while(RS.next())
							{
								Livre L = new Livre() ;
								L.SetRef(RS.getInt(1)) ;
								L.SetTitre(RS.getString(2)) ;
								L.SetPrixUnitaire(RS.getFloat(3)) ;
								L.SetAuteur(RS.getString(4)) ;
								LL.add(L) ;
							}
					}
				catch(SQLException E)
					{
						E.printStackTrace() ;
					}
				return(LL) ;
			}
	}