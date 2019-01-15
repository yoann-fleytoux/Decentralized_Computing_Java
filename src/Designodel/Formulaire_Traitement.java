        
    																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
        
/*****************************************************
 * Code generee automatiquement                      *
 * Generateur IUT 2009-2010                          *
 * Generation de la classe : Formulaire_Traitement*
 *****************************************************/

package Designodel ; 
public class Formulaire_Traitement 
{

	public URL url ; //

	public Requete requete ; //

	public string calcul_demande ; //

	public Designodel.TraitementServeurImpl TraitementServeurImpl ; //

	public Designodel.TraitementServeurImpl TraitementServeurImpl ; //

	public Designodel.Requete Requete ; //

	public Designodel.URL URL ; //


	public void setUrl(URL val) 
	{
		this.url = val ;
	}


	public URL getUrl() 
	{
		 return this.url ;
	}


	public void setRequete(Requete val) 
	{
		this.requete = val ;
	}


	public Requete getRequete() 
	{
		 return this.requete ;
	}


	public void setCalcul_demande(string val) 
	{
		this.calcul_demande = val ;
	}


	public string getCalcul_demande() 
	{
		 return this.calcul_demande ;
	}


	public void setTraitementServeurImpl(Designodel.TraitementServeurImpl val) 
	{
		this.TraitementServeurImpl = val ;
		if (!val.getFormulaire_Traitement().contains(this))
		{
			val.addFormulaire_Traitement(this) ;
		}
	}


	public Designodel.TraitementServeurImpl getTraitementServeurImpl() 
	{
		 return this.TraitementServeurImpl ;
	}


	public void setTraitementServeurImpl(Designodel.TraitementServeurImpl val) 
	{
		this.TraitementServeurImpl = val ;
		if (!val.getFormulaire_Traitement().contains(this))
		{
			val.addFormulaire_Traitement(this) ;
		}
	}


	public Designodel.TraitementServeurImpl getTraitementServeurImpl() 
	{
		 return this.TraitementServeurImpl ;
	}


	public void setRequete(Designodel.Requete val) 
	{
		this.Requete = val ;
		if (!val.getFormulaire_Traitement().contains(this))
		{
			val.addFormulaire_Traitement(this) ;
		}
	}


	public Designodel.Requete getRequete() 
	{
		 return this.Requete ;
	}


	public void setURL(Designodel.URL val) 
	{
		this.URL = val ;
		if (!val.getFormulaire_Traitement().contains(this))
		{
			val.addFormulaire_Traitement(this) ;
		}
	}


	public Designodel.URL getURL() 
	{
		 return this.URL ;
	}


}

        


	