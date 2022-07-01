/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.examen.repository;

import com.examen.examen.entity.Concierto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author XPC
 */
@Repository
public interface ConciertoRepository extends CrudRepository<Concierto,Long>{
    
}
