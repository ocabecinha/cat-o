package br.edu.unifacisa.redesocialx.controller;

import br.edu.unifacisa.redesocialx.model.Produto;
import br.edu.unifacisa.redesocialx.contrepository.ProdutoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedeSocialXController {
    private ProdutoRepository ProdutoRepository;

    public RedeSocialXController(ProdutoRepository ProdutoRepository) {
        this.ProdutoRepository = ProdutoRepository;
    }
    @GetMapping("/add")
    public String addProduto(){
        Produto p = new Produto();
        p.setNome("blaibede");
        p.setValor(5.0);
        p.setQtdAmigos(10);
        ProdutoRepository.save(p);
        return "index";
    }

    @GetMapping("/listar")
    public String listarProduto(){
        return "index";
    }

    @GetMapping()
    public String intex() {
        return "intex";
    }

    @GetMapping("/notificacoes")
    public String outraPagina() {
        return "notificacoes";
    }



}