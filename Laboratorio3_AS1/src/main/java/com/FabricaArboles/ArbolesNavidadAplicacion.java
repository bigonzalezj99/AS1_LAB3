package com.FabricaArboles;

import java.util.*;

public class ArbolesNavidadAplicacion {

    public ArbolesNavidadAplicacion() {
    }

    public static void main(String[] args) {
        
        IArbol pinabetTree = new ArbolPinabeto();
        ArbolNavidad pinabetBombsDecorator = new DecoradorBombas(pinabetTree);
        ArbolNavidad pinabetLightsDecorator = new DecoradorLuces(pinabetTree);
        ArbolNavidad pinabetSlatsDecorator = new DecoradorListones(pinabetTree);
        ArbolNavidad pinabetSnowDecorator = new DecoradorNieve(pinabetTree);
        ArbolNavidad pinabetStarDecorator = new DecoradorEstrella(pinabetTree);
        pinabetBombsDecorator.place();
        pinabetLightsDecorator.place();
        pinabetSlatsDecorator.place();
        pinabetSnowDecorator.place();
        pinabetStarDecorator.place();
        
        IArbol parsnipTree = new ArbolChirivisco();
        ArbolNavidad parsnipBombsDecorator = new DecoradorBombas(parsnipTree);
        ArbolNavidad parsnipLightsDecorator = new DecoradorLuces(parsnipTree);
        ArbolNavidad parsnipSlatsDecorator = new DecoradorListones(parsnipTree);
        ArbolNavidad parsnipSnowDecorator = new DecoradorNieve(parsnipTree);
        ArbolNavidad parsnipStarDecorator = new DecoradorEstrella(parsnipTree);
        parsnipBombsDecorator.place();
        parsnipLightsDecorator.place();
        parsnipSlatsDecorator.place();
        parsnipSnowDecorator.place();
        parsnipStarDecorator.place();
        
        IArbol pineTree = new ArbolPino();
        ArbolNavidad pineBombsDecorator = new DecoradorBombas(pineTree);
        ArbolNavidad pineLightsDecorator = new DecoradorLuces(pineTree);
        ArbolNavidad pineSlatsDecorator = new DecoradorListones(pineTree);
        ArbolNavidad pineSnowDecorator = new DecoradorNieve(pineTree);
        ArbolNavidad pineStarDecorator = new DecoradorEstrella(pineTree);
        pineBombsDecorator.place();
        pineLightsDecorator.place();
        pineSlatsDecorator.place();
        pineSnowDecorator.place();
        pineStarDecorator.place();
        
        IArbol hollyTree = new ArbolAcebo();
        ArbolNavidad hollyBombsDecorator = new DecoradorBombas(hollyTree);
        ArbolNavidad hollyLightsDecorator = new DecoradorLuces(hollyTree);
        ArbolNavidad hollySlatsDecorator = new DecoradorListones(hollyTree);
        ArbolNavidad hollySnowDecorator = new DecoradorNieve(hollyTree);
        ArbolNavidad hollyStarDecorator = new DecoradorEstrella(hollyTree);
        hollyBombsDecorator.place();
        hollyLightsDecorator.place();
        hollySlatsDecorator.place();
        hollySnowDecorator.place();
        hollyStarDecorator.place();
        
        IArbol balsamTree = new ArbolBalsamo();
        ArbolNavidad balsamBombsDecorator = new DecoradorBombas(balsamTree);
        ArbolNavidad balsamLightsDecorator = new DecoradorLuces(balsamTree);
        ArbolNavidad balsamSlatsDecorator = new DecoradorListones(balsamTree);
        ArbolNavidad balsamSnowDecorator = new DecoradorNieve(balsamTree);
        ArbolNavidad balsamStarDecorator = new DecoradorEstrella(balsamTree);
        balsamBombsDecorator.place();
        balsamLightsDecorator.place();
        balsamSlatsDecorator.place();
        balsamSnowDecorator.place();
        balsamStarDecorator.place();
    }
}