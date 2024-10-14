package com.cafeteria.coffeshop.corredores;

public interface CorredorGeral {
    String listarItems();

    void gerarCorredor();

    int selecionarValor(String ITEM);

    String selecionarItem(String ITEM);


}
