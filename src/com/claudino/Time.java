package com.claudino;

public class Time {
    private int idTime;
    private String nomeTime;

    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }
    public void listarJogadores(){
        this.listarJogadores();
    }
    public void imprimirTime(){
        System.out.println("O nome do time é " + nomeTime);
        System.out.println("O id é " + idTime);
    }
}
