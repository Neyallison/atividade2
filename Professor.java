/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Ney Allison
 */
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Professor {
    String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public void modificarNota(Aluno aluno, int indice, double novaNota, Map<String, List<String>> log) {
        String logEntry = "Professor: " + nome + ", Aluno: " + aluno.nome + ", Nota Anterior: " +
                aluno.notas.get(indice) + ", Nova Nota: " + novaNota;
        log.computeIfAbsent(aluno.nome, k -> new ArrayList<>()).add(logEntry);
        aluno.notas.set(indice, novaNota);
        aluno.calcularMedia(false);
    }
}
