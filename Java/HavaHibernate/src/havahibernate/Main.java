/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package havahibernate;

import java.util.List;
import java.util.Scanner;
import javax.security.auth.login.Configuration;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Marcus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        formAluno formaluno = new formAluno();


        formaluno.setVisible(true);



    /*
        
      AlunoHibernate alunosHibernate = new AlunoHibernate();



      alunos aluno = new alunos();

      aluno.setAluno_codigo(5);

     alunosHibernate.ExcluirAluno(aluno);




      List<alunos> alunos = alunosHibernate.getAlunos();

      int numeroAlunos = alunos.size();



      String dados = "";

      for(int i = 0;i<numeroAlunos;i++)
      {
          
          alunos oAluno = alunos.get(i);

          dados+=oAluno.getAluno_codigo()+" - "+oAluno.getAluno_nome()+" - "+oAluno.getAluno_cidade()+" - "+oAluno.getAluno_fone()+" - "+oAluno.getAluno_curso()+"\n";

      }

      System.out.println("Alunos Cadastrados:\n\n\n"+dados);

      System.out.println("Digite 1 para inserir um novo aluno\nDigite 2 para excluir um aluno");

      Scanner scanner = new Scanner(System.in);

      int valor = scanner.nextInt();


      switch(valor)
      {
          case 1:
          {

              alunos aluno = new alunos();

              System.out.println("Digite o id do novo aluno");
              int id = scanner.nextInt();
              aluno.setAluno_codigo(id);


              System.out.println("Digite o nome do aluno");
              String nome = scanner.next();
              aluno.setAluno_nome(nome);

               System.out.println("Digite o curso do aluno");
              String curso = scanner.next();
              aluno.setAluno_curso(curso);

               System.out.println("Digite o telefone do aluno");
              String telefone = scanner.next();
              aluno.setAluno_fone(telefone);

               System.out.println("Digite a cidade do aluno");
              String cidade = scanner.next();
              aluno.setAluno_cidade(cidade);

             alunosHibernate.gravarAluno(aluno);

             System.out.println("Aluno Cadastrado com sucesso!!!!!!");
              
              break;

          }
          case 2:
          {

              break;
          }
          default:
          {
              break;
          }
      }*/




    }

}
