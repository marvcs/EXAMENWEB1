/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.examen.service;

import com.examen.examen.entity.Concierto;
import com.examen.examen.repository.ConciertoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author XPC
 */
@Service
public class ConciertoService implements IConciertoService{
        
    @Autowired /*inyeccion de dependencias, conexion con repositorio*/
    private ConciertoRepository conciertoRepository;

    @Override
    public List<Concierto> getAllConciertos() {
        return (List<Concierto>)conciertoRepository.findAll();    
    }

    @Override
    public Concierto getConciertoById(long id) {
        return conciertoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveConcierto(Concierto concierto) {
        conciertoRepository.save(concierto);
    }

    @Override
    public void delete(long id) {
        conciertoRepository.deleteById(id); 
    }
    
}
