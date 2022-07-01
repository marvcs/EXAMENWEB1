/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.examen.service;

import com.examen.examen.entity.Concierto;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author XPC
 */
@Service
public interface IConciertoService {
    public List<Concierto> getAllConciertos();
    public Concierto getConciertoById(long id);
    public void saveConcierto(Concierto persona);
    public void delete(long id);
}
