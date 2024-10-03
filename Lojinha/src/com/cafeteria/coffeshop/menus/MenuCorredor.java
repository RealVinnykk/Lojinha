package com.cafeteria.coffeshop.menus;

import javax.lang.model.type.ErrorType;
import javax.management.RuntimeErrorException;
import java.util.Scanner;

public class MenuCorredor  implements MenuGeral  {

    private Scanner scan = new Scanner(System.in);
    private String opcao1, opcao2;
    private String opt;
    public String[] options = {"BEBIDAS", "COMIDAS", "REMEDIOS"};


    public String getOptions(){
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
        }
        System.out.println("aonde voce deseja ir");
            opcao1 = scan.nextLine();
            opcao2 = opcao1.toUpperCase();
        for (int i = 0; i < options.length; i++) {
            opt = options[i].toString();
        if(opcao2.equals(opt)){
            return opcao2;
        }
        }


        return "ERRO";
    }

    @Override
    public void update() {

    }

    @Override
    public void getEntrada() {

    }

}
