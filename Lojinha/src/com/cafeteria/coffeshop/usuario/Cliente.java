package com.cafeteria.coffeshop.usuario;

import com.sun.jdi.event.ExceptionEvent;

public class Cliente extends Exception {

    private final String nome;
    private double saldo;

    public Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        System.out.println("seu nome e : " + this.nome);
        return this.nome;
    }

    public double getSaldo() {
        System.out.println("seu saldo e de : " + this.saldo);
        return this.saldo;
    }

    public double setSaldo(double saldo) throws IllegalAccessException {
        if (saldo <= 0) {
            throw new IllegalAccessException("ERRO");
        } else if (saldo > this.saldo) {
            this.saldo += saldo;
        } else if (saldo <= this.saldo) {
            this.saldo -= saldo;
        }
        System.out.println(saldo);
        return saldo;
    }
}

