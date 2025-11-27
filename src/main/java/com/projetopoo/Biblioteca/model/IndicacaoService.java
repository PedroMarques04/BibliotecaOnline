/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.projetopoo.Biblioteca.model;
//import java.util.ArrayList;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author phpup
 */
@Service
public class IndicacaoService {

    @Autowired
    IndicacaoLivroDAO idao;

    public void inserirIndicacao(IndicacaoLivro indicacao){
        idao.inserirIndicacao(indicacao);
    }

    public ArrayList<IndicacaoLivro> listarIndicacoes(){
        return idao.listar();
    }

    public IndicacaoLivro obterIndicacao(int id){
        return idao.obterIndicacao(id);
    }

    public void atualizarIndicacao(int id, IndicacaoLivro indicacao){
        idao.atualizarIndicacao(id, indicacao);
    }

    public void deletar(int id){
        idao.deletar(id);
    }

}
