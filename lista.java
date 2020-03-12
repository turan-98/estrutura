/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no;

/**
 *
 * @author samuel.silva
 */
public class No {
    private No inicio;
    /**
     * @param args the command line arguments
     */
    // inicio da lista começa v azio
    public int dado;
    public No prox;
   
    public No(int e){
        dado = e;
        prox = null;
    }
 
    public void adicionaInicio(int e){
       No novo = new No(e);
       novo.prox = inicio;
       inicio = novo;
       System.out.println(novo);
    }
    
    public void adicionaFinal(int e){
        No novo = new No(e);
        if(inicio != null){
            inicio=novo;
        }else{
            No aux = inicio;
            while(aux.prox != null){
                aux = aux.prox;
            } aux.prox = novo;
        }
        System.out.println(novo);
    }
    
    
    public int removeInicio(){
        int r = -2000000;
        if(inicio != null){
            r = inicio.dado;
            inicio = inicio.prox;
            System.out.println(r);
        }else{
            System.out.println("Erro");
        }
        return r;
        
    }
    
    public String ToString(){
        String resp = "";
        No aux=inicio;
        while(aux != null){
            resp = resp + aux.dado + " ";
            aux = aux.prox;
        }
        return resp;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       No u = new No(8);
       u.adicionaInicio(5);
       u.adicionaFinal(5);
       u.removeInicio();
    }
    
}
