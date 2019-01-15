        
    																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
        
/*****************************************************
 * Code generee automatiquement                      *
 * Generateur IUT 2009-2010                          *
 * Generation de la classe : String*
 *****************************************************/

package Designodel ; 
public class String implements Demarcheercure.java.io.Serializable 
{

	public Designodel.Decoder_Formulaire Decoder_Formulaire ; //


	public void setDecoder_Formulaire(Designodel.Decoder_Formulaire val) 
	{
		this.Decoder_Formulaire = val ;
		if (!val.getString().contains(this))
		{
			val.addString(this) ;
		}
	}


	public Designodel.Decoder_Formulaire getDecoder_Formulaire() 
	{
		 return this.Decoder_Formulaire ;
	}


}

        


	