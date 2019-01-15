        
    																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
        
/*****************************************************
 * Code generee automatiquement                      *
 * Generateur IUT 2009-2010                          *
 * Generation de la classe : Decoder_Formulaire*
 *****************************************************/

package Designodel ; 
public class Decoder_Formulaire 
{

	public Designodel.Traitement_requeteImpl Traitement_requeteImpl ; //

	public Designodel.TraitementServeurImpl TraitementServeurImpl ; //

	public Designodel.TraitementServeurImpl TraitementServeurImpl1 ; //

	public Designodel.String String ; //


	public void Interpreter_Formulaire(StringBuffer formulaire_GestionThread)
	{

		
	}


	public void setTraitement_requeteImpl(Designodel.Traitement_requeteImpl val) 
	{
		this.Traitement_requeteImpl = val ;
		if (!val.getDecoder_Formulaire().contains(this))
		{
			val.addDecoder_Formulaire(this) ;
		}
	}


	public Designodel.Traitement_requeteImpl getTraitement_requeteImpl() 
	{
		 return this.Traitement_requeteImpl ;
	}


	public void setTraitementServeurImpl(Designodel.TraitementServeurImpl val) 
	{
		this.TraitementServeurImpl = val ;
		if (!val.getDecoder_Formulaire().contains(this))
		{
			val.addDecoder_Formulaire(this) ;
		}
	}


	public Designodel.TraitementServeurImpl getTraitementServeurImpl() 
	{
		 return this.TraitementServeurImpl ;
	}


	public void setTraitementServeurImpl(Designodel.TraitementServeurImpl val) 
	{
		this.TraitementServeurImpl = val ;
		if (!val.getDecoder_Formulaire().contains(this))
		{
			val.addDecoder_Formulaire(this) ;
		}
	}


	public Designodel.TraitementServeurImpl getTraitementServeurImpl() 
	{
		 return this.TraitementServeurImpl ;
	}


	public void setString(Designodel.String val) 
	{
		this.String = val ;
		if (!val.getDecoder_Formulaire().contains(this))
		{
			val.addDecoder_Formulaire(this) ;
		}
	}


	public Designodel.String getString() 
	{
		 return this.String ;
	}


}

        


	