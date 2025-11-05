package org.model.principal;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.model.Livro;

import java.time.LocalDate;
import java.util.Date;

public class Principal {
    public static void main(String[] args){
        Livro livro = new Livro();
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("UN-Livro");
        EntityManager em = factory.createEntityManager();
        livro.setTitulo("Titulo Livro");
        livro.setAutor("Autor");
        livro.setData(LocalDate.now());

        em.getTransaction().begin();
        em.persist(livro);
        em.getTransaction().commit();


        factory.close();
    }
}
