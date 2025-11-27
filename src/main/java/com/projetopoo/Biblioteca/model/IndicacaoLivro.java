/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.projetopoo.Biblioteca.model;

/**
 *
 * @author phpup
 */
public class IndicacaoLivro {
    private int id;
    private String nome, livro, autor, categoria;

    //select
    public IndicacaoLivro(int id, String nome, String livro, String autor, String categoria) {
        this.autor = autor;
        this.categoria = categoria;
        this.id = id;
        this.livro = livro;
        this.nome = nome;
    }

    //formulario
    public IndicacaoLivro(){

    }

    //insert
   // INSERT - CORREÇÃO: ordem correta dos parâmetros
    public IndicacaoLivro(String nome, String livro, String autor, String categoria) {
        this.nome = nome;
        this.livro = livro;
        this.autor = autor;
        this.categoria = categoria;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
