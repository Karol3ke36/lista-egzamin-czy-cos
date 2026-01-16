package com.example.jakieszadzegz;

public class Todo {
    private String nazwa;
    private boolean czyZrobione;
    private int priorytet;

    public Todo(int priorytet, String nazwa) {
        this.priorytet = priorytet;
        this.nazwa = nazwa;
        czyZrobione = false;
    }

    public int getPriorytet() {
        return priorytet;
    }

    public void setPriorytet(int priorytet) {
        this.priorytet = priorytet;
    }

    public boolean isCzyZrobione() {
        return czyZrobione;
    }

    public void setCzyZrobione(boolean czyZrobione) {
        this.czyZrobione = czyZrobione;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }


}
