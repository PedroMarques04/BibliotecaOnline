/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.projetopoo.Biblioteca;

/**
 *
 * @author phpup
 */
public class Quadrinho extends ProdutoBase{
    // Atributos específicos de Quadrinho
    private String escritor;
    private String desenhista;
    private Integer numeroEdicao;
    private String editora;
    private String universo;
    private int anoPublicacao;
    private TipoQuadrinho tipoQuadrinho;

    
    // Construtores
    public Quadrinho() {
        super();
    }
    
    public Quadrinho(String nome, String escritor, String editora) {
        super(nome);
        this.escritor = escritor;
        this.editora = editora;
    }
    
    @Override
    public String getTipoProduto() {
        return "Quadrinho";
    }
    
    // Getters e Setters...
    public String getEscritor() { return escritor; }
    public void setEscritor(String escritor) { this.escritor = escritor; }
    public int getAnoPublicacao() { return anoPublicacao; }
    
    public void setAnoPublicacao(int anoPublicacao) { this.anoPublicacao = anoPublicacao;  }

    public TipoQuadrinho getTipoQuadrinho() { return tipoQuadrinho;  }
    
    public void setTipoQuadrinho(TipoQuadrinho tipoQuadrinho) {  this.tipoQuadrinho = tipoQuadrinho;  }
    
    public String getDesenhista() { return desenhista; }
    public void setDesenhista(String desenhista) { this.desenhista = desenhista; }
    
    public Integer getNumeroEdicao() { return numeroEdicao; }
    public void setNumeroEdicao(Integer numeroEdicao) { this.numeroEdicao = numeroEdicao; }
    
    public String getEditora() { return editora; }
    public void setEditora(String editora) { this.editora = editora; }
    
    public String getUniverso() { return universo; }
    public void setUniverso(String universo) { this.universo = universo; }


}
