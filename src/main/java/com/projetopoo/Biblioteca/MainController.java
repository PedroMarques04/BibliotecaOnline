/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetopoo.Biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.projetopoo.Biblioteca.model.IndicacaoLivro;
import com.projetopoo.Biblioteca.model.IndicacaoService;

/**
 *
 * @author phpup
 */
@Controller
public class MainController {

    @Autowired
    private ApplicationContext context;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/ficcao")
    public String ficcao(Model model) {

        // criação de dois livros de exemplos
        Livro narnia = new Livro("As Crônicas de Nárnia", "CS Lewis", CategoriaLivro.FICCAO);
        Livro livro1984 = new Livro("1984", "George Orwell", CategoriaLivro.FICCAO);

        // popular as infos que aparecerão na tela
        narnia.setDescricao("Série de fantasia clássica");
        narnia.setEditora("Editora WMF Martins Fontes");
        narnia.setNumeroPaginas(768);
        narnia.setAnoPublicacao(1950);
        narnia.setDestaque(Destaque.DESTAQUE);
        narnia.setSinopse("As aventuras de crianças que descobrem o mundo mágico de Nárnia.");
        narnia.setCapa("/img/narnia.png");

        livro1984.setDescricao("Romance distópico sobre totalitarismo");
        livro1984.setEditora("Companhia das Letras");
        livro1984.setNumeroPaginas(328);
        livro1984.setAnoPublicacao(1949);
        livro1984.setDestaque(Destaque.BEST_SELLER);
        livro1984.setSinopse("Winston Smith luta contra a opressão do Estado totalitário na Oceania.");
        livro1984.setCapa("/img/1984.png"); //coloquei a imagem aqui e funcionou

        //colocar os livros em uma lista, o html vai percorrer a lista para exibi-los
        //coloquei dois livros de exemplo para cada tela
        List<Livro> livrosFiccao = Arrays.asList(narnia, livro1984);

        model.addAttribute("livros", livrosFiccao);

        return "ficcao";
    }

    @GetMapping("/romance")
    public String romance(Model model) {

        Livro comoEuEraAntes = new Livro("Como Eu Era Antes de Você", "Jojo Moyes", CategoriaLivro.ROMANCE);
        Livro aCulpaEDasEstrelas = new Livro("A Culpa é das Estrelas", "John Green", CategoriaLivro.ROMANCE);

        comoEuEraAntes.setDescricao("Uma história de amor");
        comoEuEraAntes.setEditora("Intrínseca");
        comoEuEraAntes.setNumeroPaginas(320);
        comoEuEraAntes.setAnoPublicacao(2012);
        comoEuEraAntes.setDestaque(Destaque.BEST_SELLER);
        comoEuEraAntes.setSinopse("Sinopse");
        comoEuEraAntes.setCapa("/img/comoEuEra.png");

        aCulpaEDasEstrelas.setDescricao("Um Romance");
        aCulpaEDasEstrelas.setEditora("Intrínseca");
        aCulpaEDasEstrelas.setNumeroPaginas(288);
        aCulpaEDasEstrelas.setAnoPublicacao(2012);
        aCulpaEDasEstrelas.setDestaque(Destaque.DESTAQUE);
        aCulpaEDasEstrelas.setSinopse("Sinopse");
        aCulpaEDasEstrelas.setCapa("/img/culpaEstrelas.png");

        List<Livro> livrosRomance = Arrays.asList(comoEuEraAntes, aCulpaEDasEstrelas);
        model.addAttribute("livros", livrosRomance);
        return "romance";
    }

    @GetMapping("/destaques")
    public String destaques(Model model) {

        Livro narnia = new Livro("As Crônicas de Nárnia", "CS Lewis", CategoriaLivro.FICCAO);
        Livro aCulpaEDasEstrelas = new Livro("A Culpa é das Estrelas", "John Green", CategoriaLivro.ROMANCE);

        narnia.setDescricao("Série de fantasia clássica");
        narnia.setEditora("Editora WMF Martins Fontes");
        narnia.setNumeroPaginas(768);
        narnia.setAnoPublicacao(1950);
        narnia.setDestaque(Destaque.DESTAQUE);
        narnia.setSinopse("As aventuras de crianças que descobrem o mundo mágico de Nárnia.");
        narnia.setCapa("/img/narnia.png");

        aCulpaEDasEstrelas.setDescricao("Um Romance");
        aCulpaEDasEstrelas.setEditora("Intrínseca");
        aCulpaEDasEstrelas.setNumeroPaginas(288);
        aCulpaEDasEstrelas.setAnoPublicacao(2012);
        aCulpaEDasEstrelas.setDestaque(Destaque.DESTAQUE);
        aCulpaEDasEstrelas.setSinopse("Sinopse");
        aCulpaEDasEstrelas.setCapa("/img/culpaEstrelas.png");

        List<Livro> livrosDestaques = Arrays.asList(narnia, aCulpaEDasEstrelas);
        model.addAttribute("livros", livrosDestaques);
        return "destaques";
    }

    @GetMapping("/bestSellers")
    public String bestSellers(Model model) {

        Livro comoEuEraAntes = new Livro("Como Eu Era Antes de Você", "Jojo Moyes", CategoriaLivro.ROMANCE);
        Livro livro1984 = new Livro("1984", "George Orwell", CategoriaLivro.FICCAO);

        comoEuEraAntes.setDescricao("Uma história de amor");
        comoEuEraAntes.setEditora("Intrínseca");
        comoEuEraAntes.setNumeroPaginas(320);
        comoEuEraAntes.setAnoPublicacao(2012);
        comoEuEraAntes.setDestaque(Destaque.BEST_SELLER);
        comoEuEraAntes.setSinopse("Sinopse");
        comoEuEraAntes.setCapa("/img/comoEuEra.png");

        livro1984.setDescricao("Romance distópico sobre totalitarismo");
        livro1984.setEditora("Companhia das Letras");
        livro1984.setNumeroPaginas(328);
        livro1984.setAnoPublicacao(1949);
        livro1984.setDestaque(Destaque.BEST_SELLER);
        livro1984.setSinopse("Winston Smith luta contra a opressão do Estado totalitário na Oceania.");
        livro1984.setCapa("/img/1984.png");

        List<Livro> livrosDestaques = Arrays.asList(comoEuEraAntes, livro1984);
        model.addAttribute("livros", livrosDestaques);
        return "bestSellers";
    }

    @GetMapping("/quadrinhos")
    public String quadrinhos(Model model) {

    // Quadrinho 1 - Marvel
    Quadrinho crise = new Quadrinho("Crise nas Infinitas Terras", "Marv Wolfman", "DC Comics");
    crise.setDesenhista("George Pérez");
    crise.setNumeroEdicao(1);
    crise.setUniverso("DC");
    crise.setAnoPublicacao(1986);
    crise.setImagemCapa("/img/crise.jpg");
    crise.setDescricao("O título da série foi inspirada em histórias de Crossovers anteriores envolvendo as Terras Paralelas do Multiverso, tais como a Crise na Terra Dois e Crise na Terra Três");
    crise.setTipoQuadrinho(TipoQuadrinho.COMIC_BOOK);

    // Quadrinho 2 - DC
    Quadrinho guerraCivil = new Quadrinho("Guerra Civil", "Mark Millar", "Marvel Comics");
    guerraCivil.setDesenhista("Steve McNiven");
    guerraCivil.setNumeroEdicao(7);
    guerraCivil.setUniverso("Marvel");
    guerraCivil.setAnoPublicacao(2007);
    guerraCivil.setImagemCapa("/img/Civil_War_7.jpg");
    guerraCivil.setDescricao("O enredo gira em torno da discussão a respeito da Lei de Registro de Super-Humanos, imposta pelo governo após um trágico acidente causado por um grupo de heróis, obrigando que todos os heróis uniformizados revelem suas identidades e passem a ser supervisionados pelo Estado.");
    guerraCivil.setTipoQuadrinho(TipoQuadrinho.COMIC_BOOK);

    // Quadrinho 3 - Manga
    Quadrinho batman = new Quadrinho("Batman: uma morte na família", "Jim Starlin", "DC Comics");
    batman.setDesenhista("Jim Aparo");
    batman.setNumeroEdicao(1);
    batman.setUniverso("DC");
    batman.setAnoPublicacao(1988);
    batman.setImagemCapa("/img/Batman_A_Death_in_the_Family.jpg");
    batman.setDescricao("Jason Todd, o segundo Robin, encontra-se em um momento de dificuldade em sua relação com Batman e suas lutas contra os criminosos estão cada vez mais descuidadas e suicidas.");
    batman.setTipoQuadrinho(TipoQuadrinho.COMIC_BOOK);


    List<Quadrinho> listaQuadrinhos = Arrays.asList(crise, guerraCivil, batman);
    model.addAttribute("quadrinhos", listaQuadrinhos);

    return "quadrinhos";
}

    @GetMapping("/formIndicacao")
    public String indicacao(Model model) {
        model.addAttribute("ind", new IndicacaoLivro());
        return "formIndicacao";
    }

    @PostMapping("/formIndicacao")
    public String processarIndicacao(@ModelAttribute IndicacaoLivro ind) {
        IndicacaoService is = context.getBean(IndicacaoService.class);
        is.inserirIndicacao(ind);
        return "redirect:/indicacao/sucesso";
    }

    @GetMapping("/indicacao/sucesso")
    public String indicacaoSucesso() {
        return "indicacao-sucesso";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        IndicacaoService is = context.getBean(IndicacaoService.class);
        ArrayList<IndicacaoLivro> indicacoes = is.listarIndicacoes();
        model.addAttribute("indicacoes", indicacoes);
        return "listarIndicacoes";
    }

    // UPDATE - Mostrar formulário de edição
    @GetMapping("/upd/indicacao/{id}")
    public String indicacaoUpd(Model model, @PathVariable int id) {
        IndicacaoService is = context.getBean(IndicacaoService.class);
        IndicacaoLivro ind = is.obterIndicacao(id);
        model.addAttribute("ind", ind);
        model.addAttribute("id", id);
        return "formIndicacaoUpd";
    }

    // UPDATE - Processar edição
    @PostMapping("/upd/indicacao/{id}")
    public String indicacaoUpd(@ModelAttribute IndicacaoLivro ind, @PathVariable int id) {
        IndicacaoService is = context.getBean(IndicacaoService.class);
        is.atualizarIndicacao(id, ind);
        return "redirect:/listar";
    }

    // DELETE
    @PostMapping("/del/indicacao/{id}")
    public String deletar(@PathVariable int id) {
        IndicacaoService is = context.getBean(IndicacaoService.class);
        is.deletar(id);
        return "redirect:/listar";
    }
}
