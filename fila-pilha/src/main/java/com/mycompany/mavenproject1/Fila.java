package com.mycompany.mavenproject1;

public class Fila {
    private static class Celula {
        Object item;
        Celula prox;
    }

    private Celula primeiro, ultimo;

    public Fila() {
        this.primeiro = new Celula();
        this.ultimo = this.primeiro;
        this.primeiro.prox = null;
    }

    public boolean vazio() {
        return this.primeiro == this.ultimo;
    }

    public void pushFila(Object x) {
        this.ultimo.prox = new Celula();
        this.ultimo = this.ultimo.prox;
        this.ultimo.item = x;
        this.ultimo.prox = null;
    }

    public Object popFila() throws Exception {
        if (this.vazio()) {
            throw new Exception("Fila vazia.");
        }

        this.primeiro = this.primeiro.prox;

        Object item = this.primeiro.item;

        return item;
    }
}
