/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Coordenador extends Professor {

    public Coordenador(String nome) {
        super(nome);
    }

    public void modificarNotaRecuperacao(Aluno aluno, double novaNota, Map<String, List<String>> log) {
        String logEntry = "Coordenador: " + nome + ", Aluno: " + aluno.nome + ", Nota Recup. Anterior: " +
                (aluno.notaRecuperacao == -1 ? "SN" : aluno.notaRecuperacao) + ", Nova Nota Recup.: " + novaNota;
        log.computeIfAbsent(aluno.nome, k -> new ArrayList<>()).add(logEntry);
        aluno.notaRecuperacao = novaNota;
        aluno.status = novaNota >= 5 ? "APROVADO" : "REPROVADO";
    }
}
