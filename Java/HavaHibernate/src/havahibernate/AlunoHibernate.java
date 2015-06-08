/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package havahibernate;

import java.io.Serializable;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.service.jta.platform.internal.JOTMJtaPlatform;

/**
 *
 * @author Marcus
 */
public class AlunoHibernate {


    private SessionFactory fabrica;

    public AlunoHibernate()
    {
         this.fabrica = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }


    public boolean gravarAluno(alunos aluno)
    {
       boolean result = false;

        try
        {
             Session sessao =    fabrica.openSession();

             Transaction trans =      sessao.beginTransaction();

             sessao.save(aluno);

             trans.commit();

             result = true;

        }
        catch(HibernateException ex)
        {
            JOptionPane.showMessageDialog(null, "Não foi possivel gravar o registro, erro informado:\n"+ex.getMessage());
            result = false;
            
        }

       return result;


    }

    public boolean  alterarAluno(alunos aluno)
    {
         boolean result = false;

        try
        {
         Session sessao =    fabrica.openSession();

         Transaction trans =      sessao.beginTransaction();


         sessao.update(aluno);


            trans.commit();
            result = true;
        }
         catch(HibernateException ex)
        {
            JOptionPane.showMessageDialog(null, "Não foi possivel gravar o registro, erro informado:\n"+ex.getMessage());
            result = false;

        }

       return result;
    }

    public List<alunos> getAlunos()
    {
          Session sessao =    fabrica.openSession();

          List<alunos> alunos = sessao.createQuery("from alunos").list();

          return alunos;
        
    }

    public boolean ExcluirAluno(alunos aluno)
    {
         boolean result = false;

        try
        {

          Session sessao =    fabrica.openSession();

         Transaction trans =      sessao.beginTransaction();


         sessao.delete(aluno);

         result = true;


            trans.commit();
        }
          catch(HibernateException ex)
        {
            JOptionPane.showMessageDialog(null, "Não foi possivel gravar o registro, erro informado:\n"+ex.getMessage());
            result = false;

        }

         return result;


    }

   




}
