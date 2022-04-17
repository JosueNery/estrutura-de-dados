
package com.mycompany.mavenproject1;

public class Pilha {
    private static class Celula {
        Object item;
        Celula prox;
    }

    private Celula topo;
    private int tam;

    public Pilha() {
        this.topo = null;
        this.tam = 0;
    }

    public boolean vazio() {
        return this.topo == null;
    }

    public void pushPilha(Object x) {
        Celula aux = this.topo;
        this.topo = new Celula();
        this.topo.item = x;
        this.topo.prox = aux;
        this.tam++;
    }

    public Object popPilha() throws Exception {
        if (this.vazio()) {
            throw new Exception("Pilha vazia.");
        }

        Object item = this.topo.item;
        this.topo = this.topo.prox;
        this.tam--;
        return item;
    }

    public int tamanho() {
        return this.tam;
    }
}
