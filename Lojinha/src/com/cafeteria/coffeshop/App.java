package com.cafeteria.coffeshop;

import com.cafeteria.coffeshop.corredores.CorredorRemedios;
import com.cafeteria.coffeshop.menus.MenuCaixa;
import com.cafeteria.coffeshop.menus.MenuCorredor;
import com.cafeteria.coffeshop.menus.MenuGeral;
import com.cafeteria.coffeshop.usuario.Cliente;

import java.util.Scanner;

public class App {

public static void main(String args [])throws Exception{


    Scanner scanner = new Scanner(System.in);
    MenuCorredor corredor = new MenuCorredor();

    CorredorRemedios remedios = new CorredorRemedios();

    System.out.println("bem vindo a loja! \nqual seu nome");
    Cliente user = new Cliente("Vinny", 50);
    scanner.reset();

    user.getSaldo();
    user.getNome();

    corredor.getOptions();

    System.out.println("aonde voce deseja ir");
    String aonde = scanner.nextLine();


    for (int i = 0; i < corredor.options.length; i++) {
        if (aonde.equals(corredor.options[i])) {
            
        }
    }


    scanner.close();


}




}
