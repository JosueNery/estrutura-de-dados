/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;

import com.mycompany.mavenproject1.Pilha;

/**
 *
 * @author 119122537
 */
public class TestePilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        int max = 10, c, n;
        Random random = new Random();

        try {
            /* Testando pushPilha */
            for (int i = 0; i < max; i++) {
                c = Math.abs(random.nextInt() % max);
                p.pushPilha(c);
                System.out.println("[" + (p.tamanho() - 1) + "]" + "empilhou " + c);
            }

            System.out.println("Tamanho pilha: " + p.tamanho() + "\n");

            /* Testando popPilha */

            for (int i = 0; i < max; i++) {
                n = (int) p.popPilha();
                System.out.println("[" + p.tamanho() + "]" + "desempilhou " + n);
            }
            System.out.println("Tamanho pilha: " + p.tamanho());

        } catch (Exception e) {
            System.out.println("Tamanho da pilha: " + p.tamanho());
        }
    }
}
