package com.cafeteria.coffeshop.corredores;

import java.util.Arrays;

public class CorredorRemedios implements CorredorGeral{


    private String[] itens;
    private int[] valores;

    @Override
    public String listarItems() {
        return"itens =" + Arrays.toString(itens) +
                "\nvalores =" + Arrays.toString(valores);
    }

    @Override
    public void gerarCorredor() {
        itens = new String[]{"Tadalafila", "Ibuprofeno", "Amoxicilina"};
        valores = new int[]{5, 10, 25};
    }

}

