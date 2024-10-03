package com.cafeteria.coffeshop.usuario;

import java.util.ArrayList;
import java.util.List;

public class Cesta{


    private List<Item> itensNaCesta = new ArrayList<>();
    private int valor;

    public void addItem(Item item) {
        itensNaCesta.add(item);
        this.valor += item.getValor();
    }

    public int getValor() {
        return valor;
    }

    public void getItensNaCesta() {
        for(Item item : itensNaCesta){
            System.out.println(item.toString());
        }
    }
}
