/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import Classe.Aluno;
import java.util.ArrayList;

/**
 *
 * @author WESLLEIOLIVEIRADAROS
 */
public class BancoSimuladoAluno {
    public static ArrayList<Aluno> alunos =
            new ArrayList<>();

    public static int idAluno = 1;

 static {

        alunos.add(new Aluno(
                idAluno++,
                "João Silva",
                "3A",
                "Joao@email.com"
            )
        );
        
        alunos.add(new Aluno(
                idAluno++,
                "Maria Joana",
                "4B",
                "Mari@email.com" 
        )
        );
        alunos.add(new Aluno(
                idAluno++,
                "Roberto José",
                "5A",
                "Jose@email.com"
            )
        );       
    }
}

