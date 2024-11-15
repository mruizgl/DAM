package es.ies.puerto.model.jpa;




import es.ies.puerto.model.impl.Personaje;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CrudHibernate  {
    EntityManagerFactory emf;

    public CrudHibernate() {
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
    }

    public void cerrarEntityManager(EntityManager em) {
        if (em != null) {
            em.close();
        }
    }

    public void actualizarPersonaje(Personaje personaje) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(personaje);
        em.getTransaction().commit();
        cerrarEntityManager(em);
    }

    public void agregarPersonaje(Personaje personaje) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(personaje);
        em.getTransaction().commit();
        cerrarEntityManager(em);
    }

    public void eliminarPersonaje(Personaje personaje) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.contains(personaje) ? personaje : em.merge(personaje));
        em.getTransaction().commit();
        cerrarEntityManager(em);
    }

    public Personaje obtenerPersonaje(Personaje personaje) {
        EntityManager em = emf.createEntityManager();
        personaje = em.find(Personaje.class, personaje.getId());
        cerrarEntityManager(em);
        return personaje;
    }

    public List<Personaje> obtenerPersonajes() {
        EntityManager em = emf.createEntityManager();
        List<Personaje> lista = em.createQuery("SELECT p FROM "+Personaje.class.getName()+" as p").getResultList();
        return lista;
    }
}

