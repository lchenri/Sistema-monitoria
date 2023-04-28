/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.monitoria;

import java.text.DecimalFormat;
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
    
    public void geraNotaFiscal(){
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.println("\n\n--GERANDO NOTA FISCAL--");
        for(Produtos c : lista_produtos){
            System.out.println(c.getNome() + "-- R$ "  + df.format(c.getSubtotal()));
        }
    }
    
    public void cancelaCompra(){
        lista_produtos.clear();
    }
    
}
