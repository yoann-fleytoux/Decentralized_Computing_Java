        
    																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
        
/*****************************************************
 * Code generee automatiquement                      *
 * Generateur IUT 2009-2010                          *
 * Generation de la classe : TraitementServeurImpl*
 *****************************************************/

package Designodel ; 
public class TraitementServeurImpl implements Designodel.TraitementServeur 
{

	public Formulaire_Traitement formulaire_traite ; //

	public Designodel.Traitement_requete traitement_requete ; //1

	public Designodel.Traitement_calcul traitement_calcul ; //1

	public Designodel.Traitement_calcul traitement_calcul ; //1

	public Designodel.Traitement_requete traitement_requete ; //1

	public Designodel.Interpreter_traitement interpreter_traitement ; //1

	public Designodel.InputStream InputStream ; //

	public Designodel.OutputStream OutputStream ; //

	public Designodel.Decoder_Formulaire Decoder_Formulaire ; //

	public Designodel.Decoder_Formulaire Decoder_Formulaire ; //

	public Designodel.Traitement_Resultat Traitement_Resultat ; //

	public Designodel.Interpreter_traitement Interpreter_traitement ; //

	public Designodel.Formulaire_Traitement Formulaire_Traitement ; //

	public Designodel.Formulaire_Traitement Formulaire_Traitement ; //


	public void effectuer_traitement(string formulaire_ServeurWeb)
	{

		
	}


	public void setFormulaire_traite(Formulaire_Traitement val) 
	{
		this.formulaire_traite = val ;
	}


	public Formulaire_Traitement getFormulaire_traite() 
	{
		 return this.formulaire_traite ;
	}


	public void setTraitement_requete(Designodel.Traitement_requete val) 
	{
		this.traitement_requete = val ;
	}


	public Designodel.Traitement_requete getTraitement_requete() 
	{
		 return this.traitement_requete ;
	}


	public void setTraitement_calcul(Designodel.Traitement_calcul val) 
	{
		this.traitement_calcul = val ;
	}


	public Designodel.Traitement_calcul getTraitement_calcul() 
	{
		 return this.traitement_calcul ;
	}


	public void setTraitement_calcul(Designodel.Traitement_calcul val) 
	{
		this.traitement_calcul = val ;
	}


	public Designodel.Traitement_calcul getTraitement_calcul() 
	{
		 return this.traitement_calcul ;
	}


	public void setTraitement_requete(Designodel.Traitement_requete val) 
	{
		this.traitement_requete = val ;
	}


	public Designodel.Traitement_requete getTraitement_requete() 
	{
		 return this.traitement_requete ;
	}


	public void setInterpreter_traitement(Designodel.Interpreter_traitement val) 
	{
		this.interpreter_traitement = val ;
	}


	public Designodel.Interpreter_traitement getInterpreter_traitement() 
	{
		 return this.interpreter_traitement ;
	}


	public void setInputStream(Designodel.InputStream val) 
	{
		this.InputStream = val ;
		if (!val.getTraitementServeurImpl().contains(this))
		{
			val.addTraitementServeurImpl(this) ;
		}
	}


	public Designodel.InputStream getInputStream() 
	{
		 return this.InputStream ;
	}


	public void setOutputStream(Designodel.OutputStream val) 
	{
		this.OutputStream = val ;
		if (!val.getTraitementServeurImpl().contains(this))
		{
			val.addTraitementServeurImpl(this) ;
		}
	}


	public Designodel.OutputStream getOutputStream() 
	{
		 return this.OutputStream ;
	}


	public void setDecoder_Formulaire(Designodel.Decoder_Formulaire val) 
	{
		this.Decoder_Formulaire = val ;
		if (!val.getTraitementServeurImpl().contains(this))
		{
			val.addTraitementServeurImpl(this) ;
		}
	}


	public Designodel.Decoder_Formulaire getDecoder_Formulaire() 
	{
		 return this.Decoder_Formulaire ;
	}


	public void setDecoder_Formulaire(Designodel.Decoder_Formulaire val) 
	{
		this.Decoder_Formulaire = val ;
		if (!val.getTraitementServeurImpl().contains(this))
		{
			val.addTraitementServeurImpl(this) ;
		}
	}


	public Designodel.Decoder_Formulaire getDecoder_Formulaire() 
	{
		 return this.Decoder_Formulaire ;
	}


	public void setTraitement_Resultat(Designodel.Traitement_Resultat val) 
	{
		this.Traitement_Resultat = val ;
		if (!val.getTraitementServeurImpl().contains(this))
		{
			val.addTraitementServeurImpl(this) ;
		}
	}


	public Designodel.Traitement_Resultat getTraitement_Resultat() 
	{
		 return this.Traitement_Resultat ;
	}


	public void setInterpreter_traitement(Designodel.Interpreter_traitement val) 
	{
		this.Interpreter_traitement = val ;
		if (!val.getTraitementServeurImpl().contains(this))
		{
			val.addTraitementServeurImpl(this) ;
		}
	}


	public Designodel.Interpreter_traitement getInterpreter_traitement() 
	{
		 return this.Interpreter_traitement ;
	}


	public void setFormulaire_Traitement(Designodel.Formulaire_Traitement val) 
	{
		this.Formulaire_Traitement = val ;
		if (!val.getTraitementServeurImpl().contains(this))
		{
			val.addTraitementServeurImpl(this) ;
		}
	}


	public Designodel.Formulaire_Traitement getFormulaire_Traitement() 
	{
		 return this.Formulaire_Traitement ;
	}


	public void setFormulaire_Traitement(Designodel.Formulaire_Traitement val) 
	{
		this.Formulaire_Traitement = val ;
		if (!val.getTraitementServeurImpl().contains(this))
		{
			val.addTraitementServeurImpl(this) ;
		}
	}


	public Designodel.Formulaire_Traitement getFormulaire_Traitement() 
	{
		 return this.Formulaire_Traitement ;
	}


}

        


	