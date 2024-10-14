package com.cafeteria.coffeshop.corredores;

import java.util.Arrays;

public class CorredorRemedios implements CorredorGeral{


    private String[] itens;
    private int[] valores;

    @Override
    public String listarItems() {
        return "item =" + Arrays.toString(itens) +
                "valor =" + Arrays.toString(valores);
    }

    @Override
    public void gerarCorredor() {
        itens = new String[]{"TADALAFILA", "IBUPROFENO", "AMOXICILINA"};
        valores = new int[]{5, 10, 25};
    }

    @Override
    public int selecionarValor(String ITEM) {
        for (int i = 0; i < valores.length; i++) {
            if (ITEM.equalsIgnoreCase(itens[i])) {
                return valores[i];
            }
        }
        return 0;
    }


    @Override
    public String selecionarItem(String ITEM) {
        for (int i = 0; i < itens.length; i++) {
            if (ITEM.equalsIgnoreCase(itens[i])) {
                return itens[i];
            }
        }

        return null;
    }
}

