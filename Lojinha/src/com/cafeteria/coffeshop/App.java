package com.cafeteria.coffeshop;

import com.cafeteria.coffeshop.corredores.CorredorCaixa;
import com.cafeteria.coffeshop.corredores.CorredorGeral;
import com.cafeteria.coffeshop.menus.MenuCorredor;
import com.cafeteria.coffeshop.usuario.Cesta;
import com.cafeteria.coffeshop.usuario.Cliente;

import java.util.Scanner;

public class App {

public static void main(String args [])throws Exception{


    Scanner scanner = new Scanner(System.in);
    MenuCorredor geralCorredor = new MenuCorredor();

    System.out.println("bem vindo a loja! \nqual seu nome:");
    Cliente user = new Cliente(scanner.nextLine(), 50);
    Cesta cesta = new Cesta();
    CorredorCaixa caixa = new CorredorCaixa();

    scanner.reset();

    user.getSaldo();
    user.getNome();

    boolean escolhendoCorredor = true;

    while (escolhendoCorredor == true) {

        String aonde = geralCorredor.aondeIr();

        if (aonde.equals(geralCorredor.qualOpcao(aonde))) {
            boolean noCorredor = true;
            CorredorGeral corredorNovo = geralCorredor.criarCorredor(aonde);
            corredorNovo.gerarCorredor();

            while (noCorredor == true) {

                System.out.println("voce entrou no corredor de " + aonde);
                System.out.println(corredorNovo.listarItems());
                System.out.println("qual item voce deseja? ( informe \"sair\" para sair!): ");
                String qualItem = scanner.nextLine();
                qualItem = qualItem.toUpperCase();

                if (qualItem.equalsIgnoreCase("sair")) {
                    break;
                } else if (qualItem != "sair") {
                    System.out.println("voce adicionou" + qualItem + "na sua cesta, no valor de " + corredorNovo.selecionarValor(qualItem));
                    cesta.addItem(corredorNovo.selecionarItem(qualItem), corredorNovo.selecionarValor(qualItem));
                } else {
                    System.out.println("opcao nao encontrada, informe \"SAIR\" para sair...");
                }

            }
        } else if (aonde.equalsIgnoreCase("caixa") && cesta.tamanhoCesta() > 0) {


            System.out.println("voce esta indo pro caixa!");
            caixa.verCesta(cesta.getItensNaCesta(), cesta.getValor());

            user.setSaldo(cesta.getValor());


            break;
        } else {
            System.out.println("digite uma opcao valida ou seu cesta está vazia! ");
        }


    }



    scanner.close();


}




}
