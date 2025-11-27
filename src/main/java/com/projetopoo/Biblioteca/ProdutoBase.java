/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.projetopoo.Biblioteca;

/**
 *
 * @author phpup
 */
public abstract class ProdutoBase implements Produto {
    
    // Atributos comuns a todos os produtos
    protected String id;
    protected String nome;
    protected String descricao;
    protected String imagemCapa;
    
    // Construtor padrão
    public ProdutoBase() {}
    
    public ProdutoBase(String nome) {
        this.nome = nome;
    }
    
    // Implementação dos métodos da interface
    @Override
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String getImagemCapa() {
        return imagemCapa;
    }
    
    public void setImagemCapa(String imagemCapa) {
        this.imagemCapa = imagemCapa;
    }
    
    // Método abstrato que as classes concretas devem implementar
    public abstract String getTipoProduto();
    
    // Método comum a todos os produtos
    public String getInfoBasica() {
        return String.format("%s [%s]", nome, getTipoProduto());
    }
    
    @Override
    public String toString() {
        return getInfoBasica();
    }

}
