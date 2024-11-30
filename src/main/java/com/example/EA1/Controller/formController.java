/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EA1.Controller;

import com.example.EA1.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author aaron
 */

@Controller
public class formController {
    @GetMapping("/registro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new Producto());
        return "formRegistro";
    }

  @PostMapping("/submit")
public String submitForm(@ModelAttribute Producto producto, Model model) {
    model.addAttribute("producto", producto);
    return "exito";
}
}
