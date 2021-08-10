package br.univille.mvgentildsi2021.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.mvgentildsi2021.model.Vendedor;
import br.univille.mvgentildsi2021.service.VendedorService;

@Controller
@RequestMapping("/vendedor")
public class VendedorController {

    @Autowired
    private VendedorService service;

    @GetMapping
    public ModelAndView index(){
        List<Vendedor> listaVendedores = service.getAll();
        return new ModelAndView("vendedor/index", "listaVendedores", listaVendedores);
    }
    
    @GetMapping("/novo")
    public ModelAndView novo(@ModelAttribute Vendedor vendedor){
        return new ModelAndView("/vendedor/form");
    }

    @PostMapping(params = "form")
    public ModelAndView save(Vendedor vendedor){
        service.save(vendedor);
        return new ModelAndView("redirect:/vendedor");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Vendedor vendedor){
        return new ModelAndView("/vendedor/form","vendedor",vendedor);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Vendedor vendedor){
        service.delete(vendedor);
        return new ModelAndView("redirect:/vendedor");
    }
}
