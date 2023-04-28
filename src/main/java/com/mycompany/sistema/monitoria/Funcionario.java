package com.mycompany.sistema.monitoria;

import java.util.Scanner;

public class Funcionario {
    
    private Scanner in;
    private String nome;
    protected boolean admin;
    
    public Funcionario(String nome) {
        this.nome = nome;
        admin = false;
        //Venda tela = new Venda(this);
        opcoes();
    }
    
    private void imprimeHome(){
        System.out.println("""
                           1 - Venda
                           2 - Opcoes
                           0 - Sair
                           """);
    }
    
    private void imprimeVenda(){
        System.out.println("""
                           1 - Maca
                           2 - Arroz
                           3 - Sprite
                           4 - Coca-Cola
                           5 - Trakinas
                           6 - Picanha
                           """);
    }
    
    private void venda(){
        Cliente c = new Cliente();
        int op;
        do{
            imprimeVenda();
            op = in.nextInt();
            switch(op){
                case 1:
                    Maca maca = new Maca();
                    c.adicionaProdutoLista(maca);
                    break;
                case 2:
                    Arroz arroz = new Arroz();
                    c.adicionaProdutoLista(arroz);
                    break;
                case 3:
                    Sprite sprite = new Sprite();
                    c.adicionaProdutoLista(sprite);
                    break;
                case 4: 
                    CocaCola coca = new CocaCola();
                    c.adicionaProdutoLista(coca);
                    break;
                case 5:
                    Trakinas trakinas = new Trakinas();
                    c.adicionaProdutoLista(trakinas);
                    break;
                case 6:
                    Picanha picanha = new Picanha();
                    c.adicionaProdutoLista(picanha);
                    break;
                default:
                    System.out.println("Numero incorreto");
            }
        }while (op != 0);
    }
    
    private void opcoes(){
        int opc;
        do{
            imprimeHome();
            opc = in.nextInt();
            switch (opc) {
                case 1:
                    venda();
                    break;
                default:
                    throw new AssertionError();
            }
        }while(opc != 0);
    }
    public boolean getAdmin(){
        return admin;
    }
}
