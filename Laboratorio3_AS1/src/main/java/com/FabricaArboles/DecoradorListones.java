package com.FabricaArboles;

import java.util.*;

public class DecoradorListones extends ArbolNavidad {

    int controlSlats = 0;
    
    public DecoradorListones(IArbol place) {
        super(place);
    }
    
    public void place(){
        super.place.place("Pinabeto");
        this.addSlats(super.place);     
        
        super.place.place("Chirivisco");
        this.addSlats(super.place);
        
        super.place.place("Pino");
        this.addSlats(super.place);
        
        super.place.place("Acebo");
        this.addSlats(super.place);
        
        super.place.place("Bálsamo");
        this.addSlats(super.place);
    }
    
    public void addSlats(IArbol tree) {
        if (tree instanceof ArbolPinabeto && controlSlats == 0){
            System.out.println("Decorando Pinabeto con Listones");
        }
        
        if (tree instanceof ArbolChirivisco && controlSlats == 0){
            System.out.println("Decorando Chirivisco con Listones");
        }
        
        if (tree instanceof ArbolPino && controlSlats == 0){
            System.out.println("Decorando Pino con Listones");
        }
        
        if (tree instanceof ArbolAcebo && controlSlats == 0){
            System.out.println("Decorando Acebo con Listones");
        }
        
        if (tree instanceof ArbolBalsamo && controlSlats == 0){
            System.out.println("Decorando Bálsamo con Listones");
        }
        controlSlats ++;
    }
}