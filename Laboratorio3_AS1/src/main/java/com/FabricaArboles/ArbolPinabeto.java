package com.FabricaArboles;

import java.util.*;

public class ArbolPinabeto implements IArbol {

    int fabricatePinabet = 0;
    
    public ArbolPinabeto() {
    }

    public void place(String typeTree) {
        if (fabricatePinabet == 0){
            System.out.println("Fabricando Árbol Pinabeto");
            fabricatePinabet++;
        }
    }
}