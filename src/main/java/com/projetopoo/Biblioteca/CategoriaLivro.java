/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

package com.projetopoo.Biblioteca;

/**
 *
 * @author phpup
 */
public enum CategoriaLivro {

    FICCAO("Ficção"),
    NAO_FICCAO("Não Ficção"),
    FANTASIA("Fantasia"),
    ROMANCE("Romance"),
    BIOGRAFIA("Biografia"),
    TECNOLOGIA("Tecnologia"),
    AUTO_AJUDA("Autoajuda"),
    INFANTIL("Infantil"),
    ESPIRITUALIDADE("Espiritualidade");


    //criação de um atributo para conseguir  exibir formatado na tela

    private final String label;

    CategoriaLivro(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

