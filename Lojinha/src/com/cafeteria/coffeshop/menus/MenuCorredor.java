package com.cafeteria.coffeshop.menus;

import com.cafeteria.coffeshop.corredores.*;
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

    public String getSpecific(String option){
        for(int i = 0; i < options.length;i++ ){
            if(option.equals(options[i])){
                return options[i];
            }
        }
        return "opcao nao encontrada";
    }

    @Override
    public void update() {

    }

    @Override
    public void getEntrada() {

    }

    public CorredorGeral criarCorredor(String tipo){
        if(tipo.equalsIgnoreCase("REMEDIOS")){
            return new CorredorRemedios();
        }else if(tipo.equalsIgnoreCase("BEBIDAS")){
            return new CorredorBebidas();
        }else if(tipo.equalsIgnoreCase("COMIDAS")){
    return new CorredorComidas();
        }else{
            System.out.println("ERRO, OPCAO INVALIDA");
            return null;
        }
    }
}
