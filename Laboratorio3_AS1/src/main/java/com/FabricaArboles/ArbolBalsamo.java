package com.FabricaArboles;

import java.util.*;

public class ArbolBalsamo implements IArbol {

    int fabricateBalsam = 0;
    
    public ArbolBalsamo() {
    }

    public void place(String typeTree) {
        if (fabricateBalsam == 0){
            System.out.println("Fabricando Árbol Bálsamo");
            fabricateBalsam ++;
        }
    }
}