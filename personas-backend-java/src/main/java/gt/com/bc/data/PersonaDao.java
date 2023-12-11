package gt.com.bc.data;

import gt.com.bc.domain.Persona;
import java.util.List;

/**
 *
 * @author cjbojorquez
 */
public interface PersonaDao {
     public List<Persona> encontrarTodasPersonas();
    
    public Persona encontrarPersona(Persona persona);
    
    public void insertarPersona(Persona persona);
    
    public void actualizarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
}
