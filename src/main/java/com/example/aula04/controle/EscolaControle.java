package com.example.aula04.controle;

import com.example.aula04.entidade.Escola;
import com.example.aula04.servico.EscolaServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EscolaControle {

    @Autowired
    private EscolaServico es;


    @GetMapping("/escola")
    public ModelAndView escola()
    {
        ModelAndView mv = new ModelAndView("escolaTemplate");
        mv.addObject("escolas", es.todasescolas());
        return mv;


    }

    @PostMapping("/salvarescola")
    public String salvar(@ModelAttribute Escola escola)
    {
        es.salvaescola(escola);
        return "redirect:/escola";
    }
}