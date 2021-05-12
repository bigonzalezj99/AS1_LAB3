package com.FabricaArboles;

import java.util.*;

public class DecoradorEstrella extends ArbolNavidad {

    int controlStar = 0;
    
    public DecoradorEstrella(IArbol place) {
        super(place);
    }
    
    public void place(){
        super.place.place("Pinabeto");
        this.addStar(super.place);     
        
        super.place.place("Chirivisco");
        this.addStar(super.place);
        
        super.place.place("Pino");
        this.addStar(super.place);
        
        super.place.place("Acebo");
        this.addStar(super.place);
        
        super.place.place("Bálsamo");
        this.addStar(super.place);
    }

    public void addStar(IArbol tree) {
        if (tree instanceof ArbolPinabeto && controlStar == 0){
            System.out.println("Decorando Pinabeto con Estrella");
        }
        
        if (tree instanceof ArbolChirivisco && controlStar == 0){
            System.out.println("Decorando Chirivisco con Estrella");
        }
        
        if (tree instanceof ArbolPino && controlStar == 0){
            System.out.println("Decorando Pino con Estrella");
        }
        
        if (tree instanceof ArbolAcebo && controlStar == 0){
            System.out.println("Decorando Acebo con Estrella");
        }
        
        if (tree instanceof ArbolBalsamo && controlStar == 0){
            System.out.println("Decorando Bálsamo con Estrella");
        }
        controlStar ++;
    }
}