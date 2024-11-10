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

    public void exibirListaRecuperacao() {
        System.out.println("Lista de Estudantes em Recuperacao:");
        for (Aluno aluno : alunos) {
            if ("RECUPERACAO".equals(aluno.status)) {
                System.out.println(aluno.nome + " - Média: " + aluno.media);
            }
        }
    }

    public void exibirListaReprovados() {
        System.out.println("Lista de Estudantes Reprovados:");
        for (Aluno aluno : alunos) {
            if ("REPROVADO".equals(aluno.status)) {
                System.out.println(aluno.nome + " - Média: " + aluno.media);
            }
        }
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

