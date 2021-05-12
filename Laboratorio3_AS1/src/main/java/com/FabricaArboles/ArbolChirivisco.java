package com.FabricaArboles;

import java.util.*;

public class ArbolChirivisco implements IArbol {

    int fabricateParsnip = 0;
    
    public ArbolChirivisco() {
    }

    public void place(String typeTree) {
        if (fabricateParsnip == 0){
            System.out.println("Fabricando Árbol Chirivisco");
            fabricateParsnip++;
        }
    }
}