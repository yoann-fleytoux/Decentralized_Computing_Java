        
    																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
        
/*****************************************************
 * Code generee automatiquement                      *
 * Generateur IUT 2009-2010                          *
 * Generation de la classe : Traitement_Resultat*
 *****************************************************/

package Designodel ; 
public class Traitement_Resultat extends Designodel.ServeurWeb 
{

	public Designodel.TraitementServeurImpl TraitementServeurImpl ; //


	public void Interpreter_resultat(float resultat)
	{

		
	}


	public void Interpreter_resultat(string resultat)
	{

		
	}


	public void setTraitementServeurImpl(Designodel.TraitementServeurImpl val) 
	{
		this.TraitementServeurImpl = val ;
		if (!val.getTraitement_Resultat().contains(this))
		{
			val.addTraitement_Resultat(this) ;
		}
	}


	public Designodel.TraitementServeurImpl getTraitementServeurImpl() 
	{
		 return this.TraitementServeurImpl ;
	}


}

        


	