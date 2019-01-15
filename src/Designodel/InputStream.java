        
    																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
        
/*****************************************************
 * Code generee automatiquement                      *
 * Generateur IUT 2009-2010                          *
 * Generation de la classe : InputStream*
 *****************************************************/

package Designodel ; 
public class InputStream extends Demarcheercure.org.omg.CORBA.portable.InputStream 
{

	public Designodel.TraitementServeurImpl TraitementServeurImpl ; //


	public void setTraitementServeurImpl(Designodel.TraitementServeurImpl val) 
	{
		this.TraitementServeurImpl = val ;
		if (!val.getInputStream().contains(this))
		{
			val.addInputStream(this) ;
		}
	}


	public Designodel.TraitementServeurImpl getTraitementServeurImpl() 
	{
		 return this.TraitementServeurImpl ;
	}


}

        


	