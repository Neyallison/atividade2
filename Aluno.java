/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Ney Allison
 */
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome;
    List<Double> notas = new ArrayList<>();
    double notaRecuperacao = -1; // 
    double media;
    String status;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void calcularMedia(boolean ponderada) {
        if (ponderada) {
            media = (notas.get(0) * 0.2 + notas.get(1) * 0.3 + notas.get(2) * 0.5);
        } else {
            media = (notas.get(0) + notas.get(1) + notas.get(2)) / 3.0;
        }
        definirStatus();
    }

    public void definirStatus() {
        if (media >= 7) {
            status = "APROVADO";
        } else if (media >= 2.5) {
            status = "RECUPERACAO";
        } else {
            status = "REPROVADO";
        }
    }
}
