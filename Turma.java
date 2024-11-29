/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Turma {
    String identificacao;
    String curso;
    Professor professor;
    Coordenador coordenador;
    List<Aluno> alunos = new ArrayList<>();
    Map<String, List<String>> log = new HashMap<>();

    public Turma(String identificacao, String curso, Professor professor, Coordenador coordenador) {
        this.identificacao = identificacao;
        this.curso = curso;
        this.professor = professor;
        this.coordenador = coordenador;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibirAlunosENotas(boolean aposRecuperacao) {
        System.out.println(aposRecuperacao ? "Notas após recuperação:" : "Notas iniciais:");
        for (Aluno aluno : alunos) {
            System.out.print("Nome: " + aluno.nome + " - Notas: ");
            for (double nota : aluno.notas) {
                System.out.print(nota + " ");
            }
            if (aposRecuperacao && aluno.notaRecuperacao != -1) {
                System.out.print(" | Recuperação: " + aluno.notaRecuperacao);
            }
            System.out.println();
        }
    }

    public void exibirEstatisticas() {
        int aprovados = 0, recuperacao = 0, reprovados = 0;
        for (Aluno aluno : alunos) {
            switch (aluno.status) {
                case "APROVADO" -> aprovados++;
                case "RECUPERACAO" -> recuperacao++;
                case "REPROVADO" -> reprovados++;
            }
        }
        System.out.println("Estatísticas:");
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Recuperacao: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);
    }

    public void exibirLog() {
        System.out.println("Log de Alterações:");
        for (Map.Entry<String, List<String>> entry : log.entrySet()) {
            System.out.println("Aluno: " + entry.getKey());
            for (String logEntry : entry.getValue()) {
                System.out.println(" - " + logEntry);
            }
        }
    }
}
