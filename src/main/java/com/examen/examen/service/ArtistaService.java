/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.examen.service;

import com.examen.examen.entity.Artista;
import com.examen.examen.repository.ArtistaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author XPC
 */
@Service
public class ArtistaService implements IArtistaService {
    
    @Autowired
    private ArtistaRepository artistaRepository;
    
    @Override
    public List<Artista> listArtistas() {
        return (List<Artista>)artistaRepository.findAll();
    }
}
