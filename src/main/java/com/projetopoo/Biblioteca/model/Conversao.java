/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.projetopoo.Biblioteca.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author phpup
 */
public class Conversao {

    public static ArrayList<IndicacaoLivro> converterIndicacoes(List<Map<String,Object>> mapa){
    ArrayList<IndicacaoLivro> indicacoes = new ArrayList<>();
    for(Map<String,Object> registro : mapa){
        int id = (Integer) registro.get("id");
        String nome = (String) registro.get("nome");
        String livro = (String) registro.get("livro");
        String autor = (String) registro.get("autor");
        String categoria = (String) registro.get("categoria");
        indicacoes.add(new IndicacaoLivro(id, nome, livro, autor, categoria));
    }
    return indicacoes;
}

}
