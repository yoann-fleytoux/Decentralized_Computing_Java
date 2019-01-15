        
    																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
        
/*****************************************************
 * Code generee automatiquement                      *
 * Generateur IUT 2009-2010                          *
 * Generation de la classe : OutputStream*
 *****************************************************/

package Designodel ; 
public class OutputStream extends Demarcheercure.org.omg.CORBA.portable.OutputStream 
{

	public Designodel.TraitementServeurImpl TraitementServeurImpl ; //


	public void setTraitementServeurImpl(Designodel.TraitementServeurImpl val) 
	{
		this.TraitementServeurImpl = val ;
		if (!val.getOutputStream().contains(this))
		{
			val.addOutputStream(this) ;
		}
	}


	public Designodel.TraitementServeurImpl getTraitementServeurImpl() 
	{
		 return this.TraitementServeurImpl ;
	}


}

        


	