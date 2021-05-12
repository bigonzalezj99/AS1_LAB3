package com.FabricaArboles;

import java.util.*;

public class ArbolNavidadFachada {

    public List<String> PinabetTypeTree;
    public List<String> ParsnipTypeTree;
    public List<String> PineTypeTree;
    public List<String> HollyTypeTree;
    public List<String> BalsamTypeTree;
    
    public ArbolNavidadFachada() {
        this.PinabetTypeTree = new ArrayList();
        this.ParsnipTypeTree = new ArrayList();
        this.PineTypeTree = new ArrayList();
        this.HollyTypeTree = new ArrayList();
        this.BalsamTypeTree = new ArrayList();
        
        this.PinabetTypeTree.add("Pinabeto");
        this.ParsnipTypeTree.add("Chirivisco");
        this.PineTypeTree.add("Pino");
        this.HollyTypeTree.add("Acebo");
        this.BalsamTypeTree.add("Bálsamo");
    }

    public void placePinabet() {
        IArbol pinabet = new ArbolPinabeto();
        
        for(int i=0; i<this.PinabetTypeTree.size(); i++){
            pinabet.place(this.PinabetTypeTree.get(i));
        }
    }

    public void placeParsnip() {
        IArbol parsnip = new ArbolChirivisco();
        
        for(int i=0; i<this.ParsnipTypeTree.size(); i++){
            parsnip.place(this.ParsnipTypeTree.get(i));
        }
    }

    public void PlacePine() {
        IArbol pine = new ArbolPino();
        
        for(int i=0; i<this.PineTypeTree.size(); i++){
            pine.place(this.PineTypeTree.get(i));
        }
    }

    public void PlaceHolly() {
        IArbol holly = new ArbolAcebo();
        
        for(int i=0; i<this.HollyTypeTree.size(); i++){
            holly.place(this.HollyTypeTree.get(i));
        }
    }

    public void PlaceBalsam() {
        IArbol balsam = new ArbolBalsamo();
        
        for(int i=0; i<this.BalsamTypeTree.size(); i++){
            balsam.place(this.BalsamTypeTree.get(i));
        }
    }
}