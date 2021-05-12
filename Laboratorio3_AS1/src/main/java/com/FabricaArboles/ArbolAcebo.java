package com.FabricaArboles;

import java.util.*;

public class ArbolAcebo implements IArbol {

    int fabricateHolly = 0;
    
    public ArbolAcebo() {
    }

    public void place(String typeTree) {
        if (fabricateHolly == 0){
            System.out.println("Fabricando Árbol Acebo");
            fabricateHolly++;
        }
    }
}