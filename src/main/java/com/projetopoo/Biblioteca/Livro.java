/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.projetopoo.Biblioteca;

/**
 *
 * @author phpup
 */
public class Livro extends ProdutoBase {
    
    
    // Atributos específicos de Livro
    private String autor;
    private String editora;
    private int numeroPaginas;
    private int anoPublicacao;
    private Destaque destaque;
    private String sinopse;
    private CategoriaLivro categoriaLivro;

    
    // Construtor
    public Livro() {}
    
    public Livro(String nome, String autor, CategoriaLivro categoriaLivro) {
        super(nome);
        this.autor = autor;
        this.categoriaLivro = categoriaLivro;
    }

    @Override
    public String getTipoProduto() {
        return "Livro";
    }
    
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getEditora() {
        return editora;
    }
    
    public void setEditora(String editora) {
        this.editora = editora;
    }

        public CategoriaLivro getCategoria() {
        return categoriaLivro;
    }
    
    public void setCategoria(CategoriaLivro categoriaLivro) {
        this.categoriaLivro = categoriaLivro;
    }
    
    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }
    
    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public Destaque getDestaque() {
        return destaque;
    }
    
    public void setDestaque(Destaque destaque) {
        this.destaque = destaque;
    }

    public void setCapa(String capa) {
        setImagemCapa(capa); // Usa o método da classe abstrata
    }
    
    public String getCapa() {
        return getImagemCapa(); // Usa o método da classe abstrata
    }
    
    public String getSinopse() {
        return sinopse;
    }
    
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getInfoCompleta() {
        return String.format("%s por %s - %d páginas", getNome(), autor, numeroPaginas);
    }
    
}