        
    																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
        
/*****************************************************
 * Code generee automatiquement                      *
 * Generateur IUT 2009-2010                          *
 * Generation de la classe : ServeurWeb*
 *****************************************************/

package Designodel ; 
public class ServeurWeb implements Designodel.TraitementServeur 
{

	public string formulaire ; //

	public Designodel.TraitementServeur traitementServeur ; //1

	public Designodel.TraitementServeur traitementServeur ; //1

	public Designodel.Socket Socket ; //

	public Designodel.ServerSocket ServerSocket ; //

	public Designodel.Gestion_Thread Gestion_Thread ; //


	public void Main()
	{

		
	}


	public void Interpreter_resultat()
	{

		
	}


	public void setFormulaire(string val) 
	{
		this.formulaire = val ;
	}


	public string getFormulaire() 
	{
		 return this.formulaire ;
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


	public void setSocket(Designodel.Socket val) 
	{
		this.Socket = val ;
	}


	public Designodel.Socket getSocket() 
	{
		 return this.Socket ;
	}


	public void setServerSocket(Designodel.ServerSocket val) 
	{
		this.ServerSocket = val ;
	}


	public Designodel.ServerSocket getServerSocket() 
	{
		 return this.ServerSocket ;
	}


	public void setGestion_Thread(Designodel.Gestion_Thread val) 
	{
		this.Gestion_Thread = val ;
		if (!val.getServeurWeb().contains(this))
		{
			val.addServeurWeb(this) ;
		}
	}


	public Designodel.Gestion_Thread getGestion_Thread() 
	{
		 return this.Gestion_Thread ;
	}


}

        


	