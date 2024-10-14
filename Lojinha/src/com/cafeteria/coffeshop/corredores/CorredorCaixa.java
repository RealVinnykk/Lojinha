package com.cafeteria.coffeshop.corredores;

import java.util.List;

public class CorredorCaixa implements CorredorGeral {


    public void verCesta(List<String> itens, int valor) {
        System.out.println("seus itens sao os seguintes: ");
        for (String item : itens) {
            System.out.println(item);

        }
        System.out.println(valor);
    }

    @Override
    public String listarItems() {
        return "";
    }

    @Override
    public void gerarCorredor() {

    }

    @Override
    public int selecionarValor(String ITEM) {
        return 0;
    }

    @Override
    public String selecionarItem(String ITEM) {
        return "";
    }
}
