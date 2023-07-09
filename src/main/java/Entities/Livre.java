package Entities;

public class Livre 
{
private int ref;
private String titre;
private float prixUnitaire;
private String auteur;
public Livre() 
{}
public Livre(int R,String T,int PU,String ph)
{
	super();
	this.ref=R;
	this.titre=T;
	this.prixUnitaire=PU;
	this.auteur=ph;
	}
public void SetRef(int ref) 
{
	this.ref=ref;
}
public int getRef ()
{
	return this.ref;
}
public void SetTitre(String t) 
{
	this.titre=t;
}
public String getTitre ()
{
	return this.titre;
}
public void SetPrixUnitaire(float PU) 
{
	this.prixUnitaire=PU;
}
public float getPrixUnitaire ()
{
	return this.prixUnitaire;
}
public void SetAuteur(String Ph) 
{
	this.auteur=Ph;
}
public String getAuteur ()
{
	return this.auteur;
}

}
