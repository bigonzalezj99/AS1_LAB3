package com.FabricaArboles;

import java.util.*;

public class DecoradorLuces extends ArbolNavidad {

    int controlLights = 0;
    
    public DecoradorLuces(IArbol place) {
        super(place);
    }
    
    public void place(){
        super.place.place("Pinabeto");
        this.addLights(super.place);     
        
        super.place.place("Chirivisco");
        this.addLights(super.place);
        
        super.place.place("Pino");
        this.addLights(super.place);
        
        super.place.place("Acebo");
        this.addLights(super.place);
        
        super.place.place("Bálsamo");
        this.addLights(super.place);
    }

    public void addLights(IArbol tree) {
        if (tree instanceof ArbolPinabeto && controlLights == 0){
            System.out.println("Decorando Pinabeto con Luces");
        }
        
        if (tree instanceof ArbolChirivisco && controlLights == 0){
            System.out.println("Decorando Chirivisco con Luces");
        }
        
        if (tree instanceof ArbolPino && controlLights == 0){
            System.out.println("Decorando Pino con Luces");
        }
        
        if (tree instanceof ArbolAcebo && controlLights == 0){
            System.out.println("Decorando Acebo con Luces");
        }
        
        if (tree instanceof ArbolBalsamo && controlLights == 0){
            System.out.println("Decorando Bálsamo con Luces");
        }
        controlLights++;
    }
}