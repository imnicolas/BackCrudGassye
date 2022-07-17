
package com.gassyebaile.Contactos.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter @Setter
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min=1,max=600, message = "no me cumple la condicion")
    private String nombre;
    @NotNull
    @Size(min=1,max=600, message = "no me cumple la condicion")
    private String cuit;
    @NotNull
    @Size(min=1,max=600, message = "no me cumple la condicion")
    private String contacto;
    @NotNull
    @Size(min=1,max=600, message = "no me cumple la condicion")
    private String cbu;     
}
