/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;

import com.mycompany.mavenproject1.Fila;

/**
 *
 * @author 119122537
 */
public class TesteFila {
    public static void main(String[] args) {
        Fila p = new Fila();
        int max = 10, c, n;
        Random random = new Random();

        try {
            /* Testando pushFila */

            for (int i = 0; i < max; i++) {
                c = Math.abs(random.nextInt() % max);
                p.pushFila(c);
                System.out.println("entrou na fila " + c);
            }

            System.out.println("//-------------------------//" + "\n");

            /* Testando popFila */

            for (int i = 0; i < max; i++) {
                n = (int) p.popFila();
                System.out.println("saiu da fila " + n);
            }

        } catch (Exception e) {
            System.out.println("Tamanho da fila invalido");
        }
    }
}
