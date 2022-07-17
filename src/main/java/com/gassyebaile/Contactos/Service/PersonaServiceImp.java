/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gassyebaile.Contactos.Service;

import com.gassyebaile.Contactos.Entity.Persona;
import com.gassyebaile.Contactos.Interface.IPersonaService;
import com.gassyebaile.Contactos.Repository.IPersonaRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
       ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(int id) {
     ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(int id) {
       Persona persona= ipersonaRepository.findById(id).orElse(null);
       return persona;
    }
}
