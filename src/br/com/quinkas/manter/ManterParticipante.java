/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quinkas.manter;

import br.com.quinkas.entidade.Participante;
import br.com.quinkas.entidade.Ranking;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alunos
 */
public class ManterParticipante {
    private static Map<String, Participante> participantes;
    private static Participante participanteAtual;
    private static Integer numParticipante;
    private static Ranking ranking;

    public static Ranking getRanking() {
        return ranking;
    }

    public static void setRanking(Ranking ranking) {
        ManterParticipante.ranking = ranking;
    }      
    
    public static Integer getNumParticipante() {
        if(numParticipante == null){
            numParticipante = 0;
        }
        return numParticipante;
    }

    public static void setNumParticipante(Integer numParticipante) {
        ManterParticipante.numParticipante = numParticipante;
    }
    
    
    public static Map<String, Participante> getParticipantes() {
        return participantes;
    }

    public static void setParticipantes(Map<String, Participante> participantes) {
        ManterParticipante.participantes = participantes;
    }

    public static Participante getParticipanteAtual() {
        return participanteAtual;
    }

    public static void setParticipanteAtual(Participante participanteAtual) {
        ManterParticipante.participanteAtual = participanteAtual;
    }

    public static void addParticipante(Participante participante){
        if(participantes == null){
            participantes = new HashMap();
        }
        if(numParticipante == null){
            numParticipante = 0;
        }
        numParticipante++;
        participantes.put(participante.getIpAndPorta().getIp(), participante);
    }   
    
    public static List<Participante> listParticipantes() {
        List<Participante> participanteList = new ArrayList(participantes.values());
        Collections.sort(participanteList);
        Integer i = 0;
        Ranking ranking = new Ranking();
        for (Participante participante : participanteList) {       
            participante.setPosicao(participanteList.indexOf(participante) + 1);
            ManterParticipante.participantes.put(participante.getIpAndPorta().getIp(), participante);     
            switch(i){
                case 0:
                    ranking.setPrimeiro(participanteList.get(i).getNick());
                    break;
                case 1:
                    ranking.setSegundo(participanteList.get(i).getNick());
                    break;
                case 2:
                    ranking.setTerceiro(participanteList.get(i).getNick());
                    break;
                case 3:
                    ranking.setQuarto(participanteList.get(i).getNick());
                    break;
            }
            i++;
        }
        ManterParticipante.setRanking(ranking);
        return participanteList;
    }
}
