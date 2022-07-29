/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carvalhoticket;

public class Onibus {
    private  Assento lugares[] = new Assento[20];
    private String origem;
    private String destino;


    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public boolean AdicionaPassageiro(int lugar,Cliente c){
            
        if (lugar<this.lugares.length && lugar>=0){
            if(lugares[lugar]== null){
                Assento a = new Assento();
                a.setCliente(c);
                this.lugares[lugar] = a;
                return true;
                }else {
                return false;
            }}
            else{
                return false;
        }
    }
    
    public String imprimePassageiros(String Origem ,String Destino){
        String lista ="";
        for(int cont = 0 ;cont<this.lugares.length;cont++){
            if(lugares[cont]!=null){
                lista+="[ Passageiro : "+lugares[cont].getCliente().getNome()+"\n Assento "+(cont+1)+"\n Origem : "+Origem+"\n Destino : "+Destino+"]\n";
            }
        }
        return lista;
    }
}

