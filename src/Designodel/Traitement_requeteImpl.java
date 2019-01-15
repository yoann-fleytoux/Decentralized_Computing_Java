        
    																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
        
/*****************************************************
 * Code generee automatiquement                      *
 * Generateur IUT 2009-2010                          *
 * Generation de la classe : Traitement_requeteImpl*
 *****************************************************/

package Designodel ; 
public class Traitement_requeteImpl implements Designodel.Traitement_requete 
{

	public Designodel.Decoder_Formulaire Decoder_Formulaire ; //

	public Designodel.OutputStream OutputStream ; //

	public Designodel.InputStream InputStream ; //


	public void effectuer_requete(Formulaire_Traitement formulaire_InterpreterTraitement)
	{

		
	}


	public void setDecoder_Formulaire(Designodel.Decoder_Formulaire val) 
	{
		this.Decoder_Formulaire = val ;
		if (!val.getTraitement_requeteImpl().contains(this))
		{
			val.addTraitement_requeteImpl(this) ;
		}
	}


	public Designodel.Decoder_Formulaire getDecoder_Formulaire() 
	{
		 return this.Decoder_Formulaire ;
	}


	public void setOutputStream(Designodel.OutputStream val) 
	{
		this.OutputStream = val ;
	}


	public Designodel.OutputStream getOutputStream() 
	{
		 return this.OutputStream ;
	}


	public void setInputStream(Designodel.InputStream val) 
	{
		this.InputStream = val ;
	}


	public Designodel.InputStream getInputStream() 
	{
		 return this.InputStream ;
	}


}

        


	