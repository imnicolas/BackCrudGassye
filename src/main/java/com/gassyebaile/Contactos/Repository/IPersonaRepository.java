
package com.gassyebaile.Contactos.Repository;

import com.gassyebaile.Contactos.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepository extends JpaRepository <Persona, Integer>{
    
}
