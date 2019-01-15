        
    																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
        
/*****************************************************
 * Code generee automatiquement                      *
 * Generateur IUT 2009-2010                          *
 * Generation de la classe : URL*
 *****************************************************/

package Designodel ; 
public class URL implements Demarcheercure.java.io.Serializable 
{

	public Hashmap<string,string> Parametres ; //

	public string chemin_fichier ; //

	public Designodel.Formulaire_Traitement Formulaire_Traitement ; //


	public void setParametres(Hashmap<string,string> val) 
	{
		this.Parametres = val ;
	}


	public Hashmap<string,string> getParametres() 
	{
		 return this.Parametres ;
	}


	public void setChemin_fichier(string val) 
	{
		this.chemin_fichier = val ;
	}


	public string getChemin_fichier() 
	{
		 return this.chemin_fichier ;
	}


	public void setFormulaire_Traitement(Designodel.Formulaire_Traitement val) 
	{
		this.Formulaire_Traitement = val ;
		if (!val.getURL().contains(this))
		{
			val.addURL(this) ;
		}
	}


	public Designodel.Formulaire_Traitement getFormulaire_Traitement() 
	{
		 return this.Formulaire_Traitement ;
	}


}

        


	