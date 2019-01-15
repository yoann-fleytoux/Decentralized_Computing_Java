        
    																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
        
/*****************************************************
 * Code generee automatiquement                      *
 * Generateur IUT 2009-2010                          *
 * Generation de la classe : Gestion_Thread*
 *****************************************************/

package Designodel ; 
public class Gestion_Thread 
{

	public  formulaire_ServeurWeb ; //

	public Designodel.TraitementServeur traitementServeur ; //1

	public Designodel.TraitementServeur traitementServeur ; //1

	public Designodel.ServeurWeb ServeurWeb ; //


	public void gestionThread()
	{

		
	}


	public void setFormulaire_ServeurWeb( val) 
	{
		this.formulaire_ServeurWeb = val ;
	}


	public  getFormulaire_ServeurWeb() 
	{
		 return this.formulaire_ServeurWeb ;
	}


	public void setTraitementServeur(Designodel.TraitementServeur val) 
	{
		this.traitementServeur = val ;
	}


	public Designodel.TraitementServeur getTraitementServeur() 
	{
		 return this.traitementServeur ;
	}


	public void setTraitementServeur(Designodel.TraitementServeur val) 
	{
		this.traitementServeur = val ;
	}


	public Designodel.TraitementServeur getTraitementServeur() 
	{
		 return this.traitementServeur ;
	}


	public void setServeurWeb(Designodel.ServeurWeb val) 
	{
		this.ServeurWeb = val ;
		if (!val.getGestion_Thread().contains(this))
		{
			val.addGestion_Thread(this) ;
		}
	}


	public Designodel.ServeurWeb getServeurWeb() 
	{
		 return this.ServeurWeb ;
	}


}

        


	