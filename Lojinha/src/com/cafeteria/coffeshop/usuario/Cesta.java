package com.cafeteria.coffeshop.usuario;

import java.util.ArrayList;
import java.util.List;

public class Cesta{


    private List<String> itensNaCesta = new ArrayList<>();
    private int valor;

    public void addItem(String item, int value) {
        itensNaCesta.add(item);
        this.valor += value;
    }

    public int getValor() {
        return valor;
    }

    public List<String> getItensNaCesta() {

        return itensNaCesta;

    }

    public int tamanhoCesta() {
        return itensNaCesta.size();
    }
}
