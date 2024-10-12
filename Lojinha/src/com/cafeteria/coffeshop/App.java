package com.cafeteria.coffeshop;

import com.cafeteria.coffeshop.corredores.CorredorBebidas;
import com.cafeteria.coffeshop.corredores.CorredorComidas;
import com.cafeteria.coffeshop.corredores.CorredorGeral;
import com.cafeteria.coffeshop.corredores.CorredorRemedios;
import com.cafeteria.coffeshop.menus.MenuCaixa;
import com.cafeteria.coffeshop.menus.MenuCorredor;
import com.cafeteria.coffeshop.menus.MenuGeral;
import com.cafeteria.coffeshop.usuario.Cliente;

import java.util.Scanner;

public class App {

public static void main(String args [])throws Exception{


    Scanner scanner = new Scanner(System.in);
    MenuCorredor geralCorredor = new MenuCorredor();

    System.out.println("bem vindo a loja! \nqual seu nome");
    Cliente user = new Cliente("Vinny", 50);
    scanner.reset();

    user.getSaldo();
    user.getNome();

    String aonde = geralCorredor.getOptions();

    System.out.println(aonde);

    if(aonde.equals(geralCorredor.getSpecific(aonde))){
    CorredorGeral corredorNovo = geralCorredor.criarCorredor(aonde);
    corredorNovo.toString();


    }

    scanner.close();


}




}
