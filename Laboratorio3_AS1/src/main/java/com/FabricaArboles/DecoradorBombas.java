package com.FabricaArboles;

import java.util.*;

public class DecoradorBombas extends ArbolNavidad {

    int controlBombs = 0;
    
    public DecoradorBombas(IArbol place) {
        super(place);
    }
    
    public void place(){
        super.place.place("Pinabeto");
        this.addBombs(super.place);     
        
        super.place.place("Chirivisco");
        this.addBombs(super.place);
        
        super.place.place("Pino");
        this.addBombs(super.place);
        
        super.place.place("Acebo");
        this.addBombs(super.place);
        
        super.place.place("Bálsamo");
        this.addBombs(super.place);
    }

    public void addBombs(IArbol tree) {
        if (tree instanceof ArbolPinabeto && controlBombs == 0){
            System.out.println("Decorando Pinabeto con Bombas");
        }
        
        if (tree instanceof ArbolChirivisco && controlBombs == 0){
            System.out.println("Decorando Chirivisco con Bombas");
        }
        
        if (tree instanceof ArbolPino && controlBombs == 0){
            System.out.println("Decorando Pino con Bombas");
        }
        
        if (tree instanceof ArbolAcebo && controlBombs == 0){
            System.out.println("Decorando Acebo con Bombas");
        }
        
        if (tree instanceof ArbolBalsamo && controlBombs == 0){
            System.out.println("Decorando Bálsamo con Bombas");
        }
        controlBombs ++;
    }
}