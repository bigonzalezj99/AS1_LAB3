package com.FabricaArboles;

import java.util.*;

public class ArbolPino implements IArbol {

    int fabricatePino = 0;
    
    public ArbolPino() {
    }

    public void place(String typeTree) {
        if (fabricatePino == 0){
            System.out.println("Fabricando Árbol Pino");
            fabricatePino++;
        }
    }
}