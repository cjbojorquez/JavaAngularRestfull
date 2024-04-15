package gt.com.bc.servicio;

import gt.com.bc.data.PersonaDao;
import gt.com.bc.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.Status;

/**
 *
 * @author cjbojorquez
 */
@Stateless
@Path("/personas")
public class PersonaServiceRS {
    
    @Inject
    private PersonaDao personaDao;
    
    @GET
    @Produces(value=MediaType.APPLICATION_JSON)
    public List<Persona> listarPersonas(){
        List<Persona> personas = personaDao.encontrarTodasPersonas();
        System.out.println("personas = " + personas);
        /*System.out.println("GET");
        List<Persona> personas = new ArrayList<>();
        */
        return personas;
    }
    
    @GET 
    @Produces(value=MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Persona enconrtarPersona(@PathParam("id") int id){
        
        Persona persona = personaDao.encontrarPersona(new Persona(id));
        System.out.println("persona = " + persona);
        return persona;
    }
    
    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Persona agregarPersona(Persona persona){
        
        personaDao.insertarPersona(persona);
        System.out.println("persona = " + persona);
        return persona;
    }
    
    @PUT
    @Consumes(value =  MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response ModificarPersona(@PathParam("id") int id, Persona personaModificada) {
        Persona persona= personaDao.encontrarPersona(new Persona(id));
        if(persona != null){
            personaDao.actualizarPersona(personaModificada);
            System.out.println("personaModificada = " + personaModificada);
            
            return Response.ok().entity(personaModificada).build();
        }else{
            return Response.status(Status.NOT_FOUND).build();
        }
        
    }
}
