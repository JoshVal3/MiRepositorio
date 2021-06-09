package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;

/* Esta es la clase que se va a conectar a la base de datos de persona, en caso de 
que no encuentre la tabla podemos usar la anotación de Table con el nombre de la tabla */
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    //Estas anotaciones se agregan a los registros que son llaves primarias
    @Column(name="id_persona")
    @Id
    private int idPersona;
    
    private String nombre;
    
    private String apellido;
    //Este registro se marca coomo UQ unique en la base de datos mysql
    private String email;
    
    private String telefono;
    
    public Persona(){}

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
}
