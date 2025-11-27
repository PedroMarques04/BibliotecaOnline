/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

package com.projetopoo.Biblioteca;

/**
 *
 * @author phpup
 */
public enum Destaque {
    DESTAQUE("Destaque"), BEST_SELLER("Best Seller"), LANCAMENTO("Lançamento");
    private final String label;

    //criação de um atributo para conseguir  exibir formatado na tela

    Destaque(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
