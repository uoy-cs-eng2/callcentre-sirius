package uk.ac.york.callcentre.design;

import org.eclipse.emf.ecore.EObject;

import uk.ac.york.callcentre.Transition;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See {@link https://eclipse.dev/sirius/doc/specifier/general/Writing_Queries.html#service_methods} for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public boolean isNoTransition(Transition self) {
    	return "No".equalsIgnoreCase(self.getText());
    }
    
}
