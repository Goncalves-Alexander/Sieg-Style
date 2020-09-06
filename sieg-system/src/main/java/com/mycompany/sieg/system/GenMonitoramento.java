/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sieg.system;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author alexander
 */
public class GenMonitoramento {
    Integer registroCpu = 0, historicoMaxCpu = 0, historicoMedCpu = 0, historicoMinCpu = 0;
    Integer registroRam = 0, historicoMaxRam = 0, historicoMedRam = 0, historicoMinRam = 0;
    Integer registroDisco = 0, historicoMaxDisco = 0, historicoMedDisco = 0, historicoMinDisco = 0;
    Integer contador = 0;
    void geradorAleatorios(){
        registroCpu = ThreadLocalRandom.current().nextInt(101);
        registroRam = ThreadLocalRandom.current().nextInt(101);
        registroDisco = ThreadLocalRandom.current().nextInt(101);
        contador++;
    }
    void historico(){
        //CPU
        if(historicoMaxCpu < registroCpu){
            if(contador == 1){
                historicoMinCpu = registroCpu;
            }
            historicoMaxCpu = registroCpu;
        }else if(historicoMinCpu > registroCpu){
            historicoMinCpu = registroCpu;
        }
        historicoMedCpu = (historicoMedCpu+registroCpu)/contador;
        
        //RAM
        if(historicoMaxRam < registroRam){
            if(contador == 1){
                historicoMinRam = registroRam;
            }
            historicoMaxRam = registroRam;
        }else if(historicoMinRam > registroRam){
            historicoMinRam = registroRam;
        }
        historicoMedRam = (historicoMedRam+registroRam)/contador;
        
        //Disco
        if(historicoMaxDisco < registroDisco){
            if(contador == 1){
                historicoMinDisco = registroDisco;
            }
            historicoMaxDisco = registroDisco;
        }else if(historicoMinDisco > registroDisco){
            historicoMinDisco = registroDisco;
        }
        historicoMedDisco = (historicoMedDisco+registroDisco)/contador;
    }
}
