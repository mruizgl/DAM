package es.ies.puerto.bbdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.exception.TiendaException;
import es.ies.puerto.modelo.entity.ClienteEntity;
import es.ies.puerto.modelo.impl.ClienteDAO;

public class DaoCLienteTest {
   static ClienteDAO clienteDAO;
   final int id=5;
   final String nombre="otro"; 
   final String email ="otro@email.com";
   ClienteEntity clienteEntity;
   

   @BeforeAll
   public static void beforeAll(){
    try {
        clienteDAO = new ClienteDAO();
    } catch (Exception e) {
        Assertions.fail(e.getMessage());
    }
   }
   @BeforeEach
   public void beforeEach(){
    clienteEntity = new ClienteEntity(id, nombre, email);
   }
   @Test
   public void obtenerTodos() throws TiendaException{
    clienteDAO.update(clienteEntity);
    Assertions.assertEquals(3, clienteDAO.findAll().size());
   }
   @Test
   public void obtener1(){
    try {
        clienteDAO.update(clienteEntity);
        ClienteEntity cliente2 = clienteDAO.findById(clienteEntity);
        assertEquals(clienteEntity, cliente2);
    } catch (Exception e) {
        Assertions.fail(e.getMessage());
    }
    
   }

   @AfterEach
   public void afterEach(){
    try {
        clienteDAO.delete(clienteEntity);
    } catch (Exception e) {
        Assertions.fail(e.getMessage());
    }
    
   }
}
