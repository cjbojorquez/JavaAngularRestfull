/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.com.bc.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author cjbojorquez
 */
@Entity()
@NamedQueries({
    @NamedQuery(name="Persona.encontrarTodasPersonas",query="SELECT p FROM Persona p ORDER bY p.idPersona")
})
@Table(name = "persona")
public class Persona implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_persona")
    private int idPersona;
    private String nombre;
 
    public Persona(){
        
    }
    
    public Persona(int idPersona){
        this.idPersona=idPersona;
    }

    public Persona(int idPersona, String nombre) {
        this.idPersona = idPersona;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
