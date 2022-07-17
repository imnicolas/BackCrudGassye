
package com.gassyebaile.Contactos.Interface;

import com.gassyebaile.Contactos.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona (int id);
    
    public Persona findPersona(int id);
}
