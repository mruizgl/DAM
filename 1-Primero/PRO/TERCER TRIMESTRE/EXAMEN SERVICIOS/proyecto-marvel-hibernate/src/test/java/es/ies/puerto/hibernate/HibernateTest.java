package es.ies.puerto.hibernate;





import es.ies.puerto.model.impl.Personaje;
import es.ies.puerto.model.impl.Poder;
import es.ies.puerto.model.jpa.CrudHibernate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;


public class HibernateTest {
    CrudHibernate crudHibernate;

    @BeforeEach
    public void beforeEach() {
        crudHibernate = new CrudHibernate();
    }


    @Test
    public void obtenerPersonajes() {
        Assertions.assertEquals(2, crudHibernate.obtenerPersonajes().size());
    }
    
}
