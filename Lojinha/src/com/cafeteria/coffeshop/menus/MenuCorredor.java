package com.cafeteria.coffeshop.menus;

import com.cafeteria.coffeshop.corredores.*;

import java.util.Scanner;

public class MenuCorredor {

    private Scanner scan = new Scanner(System.in);
    private String opcao1, opcao2;
    private String opt;
    public String[] options = {"BEBIDAS", "COMIDAS", "REMEDIOS"};


    public String aondeIr() {
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
        }
        System.out.println("aonde voce deseja ir ( informe \"CAIXA\" para ir ao caixa!)\n");
            opcao1 = scan.nextLine();
            opcao2 = opcao1.toUpperCase();
        for (int i = 0; i < options.length; i++) {
            opt = options[i].toString();
        if(opcao2.equals(opt)){
            return opcao2;
        } else {
            return opcao2;
        }
        }


        return "ERRO";
    }

    public String qualOpcao(String option) {
        for(int i = 0; i < options.length;i++ ){
            if(option.equals(options[i])){
                return options[i];
            }
        }
        return "opcao nao encontrada";
    }


    public CorredorGeral criarCorredor(String tipo) {
        if (tipo.equalsIgnoreCase("REMEDIOS")) {
            return new CorredorRemedios();
        } else if (tipo.equalsIgnoreCase("BEBIDAS")) {
            return new CorredorBebidas();
        } else if (tipo.equalsIgnoreCase("COMIDAS")) {
            return new CorredorComidas();
        } else if (tipo.equalsIgnoreCase("CAIXA")) {
            return new CorredorCaixa();
        }
        return null;
    }
}
