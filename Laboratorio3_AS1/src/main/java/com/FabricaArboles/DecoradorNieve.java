package com.FabricaArboles;

import java.util.*;

public class DecoradorNieve extends ArbolNavidad {

    int controlSnow = 0;
    
    public DecoradorNieve(IArbol place) {
        super(place);
    }
    
    public void place(){
        super.place.place("Pinabeto");
        this.addSnow(super.place);     
        
        super.place.place("Chirivisco");
        this.addSnow(super.place);
        
        super.place.place("Pino");
        this.addSnow(super.place);
        
        super.place.place("Acebo");
        this.addSnow(super.place);
        
        super.place.place("Bálsamo");
        this.addSnow(super.place);
    }

    public void addSnow(IArbol tree) {
        if(tree instanceof ArbolPinabeto && controlSnow == 0){
            System.out.println("Decorando Pinabeto con Nieve");
        }
        
        if(tree instanceof ArbolChirivisco && controlSnow == 0){
            System.out.println("Decorando Chirivisco con Nieve");
        }
        
        if(tree instanceof ArbolPino && controlSnow == 0){
            System.out.println("Decorando Pino con Nieve");
        }
        
        if(tree instanceof ArbolAcebo && controlSnow == 0){
            System.out.println("Decorando Acebo con Nieve");
        }
        
        if(tree instanceof ArbolBalsamo && controlSnow == 0){
            System.out.println("Decorando Bálsamo con Nieve");
        }
        controlSnow ++;
    }
}