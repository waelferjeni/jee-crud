package Service;
import java.awt.PageAttributes.MediaType;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import DAO.DAOLivre;
import Entities.Livre;

@Path("/API")
@Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
@Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON})
public class ServiceLivre
{
	DAOLivre ML= new DAOLivre();
	@POST
	
	
	@Path("/livres")
	public void ajouter(Livre L)
	{
		ML.ajouterLivre(L);
	}
	@GET
	@Path("/livres")
	public  List<Livre> ListerLivres()
	{
		return(ML.ListerLivres());
	}
}

