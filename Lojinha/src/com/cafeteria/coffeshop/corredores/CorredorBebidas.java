package com.cafeteria.coffeshop.corredores;

import java.util.Arrays;

public class CorredorBebidas implements CorredorGeral{

    private String[] itens;
    private int[] valores;

    @Override
    public String listarItems() {
        return"itens =" + Arrays.toString(itens) +
                "\nvalores =" + Arrays.toString(valores);
    }

    @Override
    public void gerarCorredor() {
    itens = new String[] {"Coca-Cola", "Fanta", "Guarazinho"};
    valores = new int[]{8, 6, 5};
    }



}
