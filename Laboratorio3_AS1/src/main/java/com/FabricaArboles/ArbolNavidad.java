package com.FabricaArboles;

import java.util.*;

public abstract class ArbolNavidad extends ArbolNavidadFachada {

    protected IArbol place;
    
    public ArbolNavidad(IArbol place) {
        this.place = place;
    }

    public void place() {
        this.place.place("Pinabeto");
        this.place.place("Chivisco");
        this.place.place("Pino");
        this.place.place("Acebo");
        this.place.place("Bálsamo");
    }
}