package com.cafeteria.coffeshop.corredores;

import java.util.Arrays;

public class CorredorComidas implements CorredorGeral{

    private String[] itens;
    private int[] valores;

    @Override
    public String listarItems() {
        return"itens =" + Arrays.toString(itens) +
                "\nvalores =" + Arrays.toString(valores);
    }

    @Override
    public void gerarCorredor() {
        itens = new String[]{"Hamburger", "Hot-Dog", "X-Tudo"};
        valores = new int[]{10, 5, 15};
    }




}
