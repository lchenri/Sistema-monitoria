package com.mycompany.sistema.monitoria;

import java.util.Scanner;

public class SistemaMonitoria {
    
    //mostra a GUI
    public static void inicia_programa(){
        //Tela inicio = new Tela();     
       // Venda venda = new Venda();
    }
    
    public static void inicio(){
        Scanner in = new Scanner(System.in);
        int cargo;
        String nome;
        System.out.println("Digite o nome do operador: ");
        nome = in.nextLine();
        System.out.println("Qual é o cargo:\n1 - Funcionario\n2 - Gerente");
        cargo = in.nextInt();
        if(cargo == 1){
            Funcionario f1 = new Funcionario(nome);
        }else{
            Administrador adm = new Administrador(nome);
        }
        
    }
    
    public static void main(String[] args) {
       //inicia_programa();
       inicio();
    }
}
