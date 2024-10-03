package com.cafeteria.coffeshop.usuario;

public class Item {
    private String tipo, nome;
    private int valor;

    public Item(String nome, String tipo, int valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString(){
        return "item: " + nome;
    }
}
