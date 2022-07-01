/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.examen.controller;

import com.examen.examen.entity.Artista;
import com.examen.examen.entity.Concierto;
import com.examen.examen.service.IArtistaService;
import com.examen.examen.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author XPC
 */
@Controller
public class ConciertoController {
    
    @Autowired
    private IConciertoService conciertoService;
    
    @Autowired
    private IArtistaService artistaService;

    @GetMapping("/concierto") /*url como se comunica controller con servicio*/
    public String index (Model model){ /*permite pasar variable al html*/
        List<Concierto> listaConciertos = conciertoService.getAllConciertos();
        model.addAttribute("titulo","Tabla Conciertos");
        model.addAttribute("conciertos",listaConciertos);
        return "conciertos";
    }
    @GetMapping("/conciertoN") /*url como se comunica controller con servicio*/
    public String crearArtista (Model model){ /*permite pasar variable al html*/
        List<Artista> listaArtistas = artistaService.listArtistas();
        model.addAttribute("concierto", new Concierto());
        model.addAttribute("artistas",listaArtistas);
        return "crear";
    }
    
    
    @PostMapping("/save") /*url como se comunica controller con servicio*/
    public String guardarPersona (@ModelAttribute Concierto concierto){ /*permite pasar variable al html*/
        conciertoService.saveConcierto(concierto);
        return "redirect:/concierto";
    }
    
    @GetMapping("/editConcierto/{id}") /*url como se comunica controller con servicio*/
    public String editarPersona (@PathVariable("id") Long idConcierto, Model model){ /*permite pasar variable al html*/
        Concierto concierto = conciertoService.getConciertoById(idConcierto);
        List<Artista> listaArtistas = artistaService.listArtistas();
        model.addAttribute("concierto", concierto);
        model.addAttribute("artistas",listaArtistas);
        return "crear";
    }
    
    @GetMapping("/delete/{id}") /*url como se comunica controller con servicio*/
    public String editarPersona (@PathVariable("id") Long idConcierto){ /*permite pasar variable al html*/
        conciertoService.delete(idConcierto);
        return "redirect:/concierto";
    }
}
