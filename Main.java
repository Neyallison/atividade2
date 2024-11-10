/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Ney Allison
 */
public class Main {
    public static void main(String[] args) {
        
        Coordenador coord = new Coordenador("Prof. Carlos Souza");
        Professor prof = new Professor("Prof. Luis Araujo");

        
        Turma turma = new Turma("1912", "Licenciatura em Computação", prof, coord);

        
        Aluno aluno1 = new Aluno("Alice");
        aluno1.notas.add(8.0);
        aluno1.notas.add(6.5);
        aluno1.notas.add(7.0);
        aluno1.calcularMedia(false);
        turma.adicionarAluno(aluno1);

        Aluno aluno2 = new Aluno("João");
        aluno2.notas.add(4.0);
        aluno2.notas.add(5.5);
        aluno2.notas.add(3.0);
        aluno2.calcularMedia(false);
        turma.adicionarAluno(aluno2);

        Aluno aluno3 = new Aluno("Mariana");
        aluno3.notas.add(2.0);
        aluno3.notas.add(3.0);
        aluno3.notas.add(1.5);
        aluno3.calcularMedia(false);
        turma.adicionarAluno(aluno3);

        
        turma.exibirEstatisticas();

       
        turma.exibirListaRecuperacao();
        turma.exibirListaReprovados();

        
        coord.modificarNotaRecuperacao(aluno2, 5.5, turma.log);

        
        turma.exibirLog();
        turma.exibirEstatisticas();
    }
}
