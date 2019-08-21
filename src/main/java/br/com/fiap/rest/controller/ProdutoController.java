package br.com.fiap.rest.controller;

import br.com.fiap.rest.entity.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("produto")
public class ProdutoController {

    @GetMapping("cadastrar")
    public String abrirFormulario(){
        return "produto/form";
    }


    @PostMapping("cadastrar")
    public String processarForm(Produto produto, Model model){
        model.addAttribute("prod",produto);
        return "produto/sucesso";
    }

}
