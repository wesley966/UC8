/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

/**
 *
 * @author WESLLEIOLIVEIRADAROS
 */
public class Aluno {
      private int id;
    private String nome;
    private String turma;
    private String email;

    public Aluno() {
    }

    public Aluno(int id, String nome, String turma, String email) {
        this.id = id;
        this.nome = nome;
        this.turma = turma;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTurma() {
        return turma;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
