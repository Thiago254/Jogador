package com.claudino;

public class Jogador {
    private int idJogador;
    private String nomeJogador;
    private String posição;
    private int numCamisa;

    public int getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getPosição() {
        return posição;
    }

    public void setPosição(String posição) {
        this.posição = posição;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }
    public void imprimir(){
        System.out.println("Nome " + nomeJogador);
        System.out.println("Id " + idJogador);
        System.out.println("Posição " + posição);
        System.out.println("Camisa " + numCamisa);
    }
}
