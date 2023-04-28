/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.monitoria;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Cliente {

    private Scanner input = new Scanner(System.in);
    private String nome_cliente;
    private List<Produtos>  lista_produtos = new ArrayList<>();
    
    public Cliente() {
        System.out.println("Digite o nome do cliente: ");
        this.nome_cliente = input.nextLine();
    }
    
    public void adicionaProdutoLista(Produtos p){
        lista_produtos.add(p);
    }
    
}
