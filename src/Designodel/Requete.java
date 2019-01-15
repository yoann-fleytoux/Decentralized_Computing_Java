        
    																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
        
/*****************************************************
 * Code generee automatiquement                      *
 * Generateur IUT 2009-2010                          *
 * Generation de la classe : Requete*
 *****************************************************/

package Designodel ; 
public class Requete 
{

	public  methode ; //

	public  http ; //

	public Designodel.Formulaire_Traitement Formulaire_Traitement ; //


	public void setMethode( val) 
	{
		this.methode = val ;
	}


	public  getMethode() 
	{
		 return this.methode ;
	}


	public void setHttp( val) 
	{
		this.http = val ;
	}


	public  getHttp() 
	{
		 return this.http ;
	}


	public void setFormulaire_Traitement(Designodel.Formulaire_Traitement val) 
	{
		this.Formulaire_Traitement = val ;
		if (!val.getRequete().contains(this))
		{
			val.addRequete(this) ;
		}
	}


	public Designodel.Formulaire_Traitement getFormulaire_Traitement() 
	{
		 return this.Formulaire_Traitement ;
	}


}

        


	