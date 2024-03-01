package es.ies.puerto.negocio;

import es.ies.puerto.modelo.Alimento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiendaTest {
    Tienda tienda;
    String id = "idAlimento";
    String nombre = "nombreAlimento";
    String nombreActualizar = "nombreActualizado";
    float precio = 2f;
    float precioActualizar = 3f;
    String fechaEntrada = "01/03/2024";
    String fechaEntradaActualizar = "02/03/2024";
    String fechaCaducidad = "16/03/2024";
    String fechaCaducidadActualizar = "17/03/2024";
    Alimento alimento;

    @BeforeEach
    public void beforeEach() {
        tienda = new Tienda();
        alimento = new Alimento(id, nombre, precio, fechaEntrada, fechaCaducidad);
        tienda.crearProducto(alimento);
    }

    @Test
    public void tiendaNotNullTest() {
        Assertions.assertNotNull(tienda, "NO puede ser null");
    }

    @Test
    public void addAlimentoTiendaTest() {
        Assertions.assertEquals(1, tienda.obtenerProductos().size(), "No se ha obtenido el tamanio esperado");
    }

    @Test
    public void addAlimentoExistenteTiendaTest() {
        tienda.crearProducto(alimento);
        Assertions.assertEquals(1, tienda.obtenerProductos().size(), "No se ha obtenido el tamanio esperado");
    }

    @Test
    public void eliminarAlimentoTest() {
        tienda.eliminarProducto(alimento);
        Assertions.assertEquals(0, tienda.obtenerProductos().size(), "No se ha obtenido el resultado esperado");
    }

    @Test
    public void obtenerAlimentoTiendaTest() {
        Alimento alimentoBuscar = new Alimento(id);
        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertEquals(nombre, alimentoBuscar.getNombre(), "No se ha obtenido el resultado esperado");
        Assertions.assertEquals(precio, alimentoBuscar.getPrecio(), "No se ha obtenido el resultado esperado");
        Assertions.assertEquals(fechaEntrada, alimentoBuscar.getfEntrada(), "No se ha obtenido el resultado esperado");
        Assertions.assertEquals(fechaCaducidad, alimentoBuscar.getfCaducidad(), "No se ha obtenido el resultado esperado");
    }

    @Test
    public void obtenerAlimentoNoExisteTiendaTest() {
        Alimento alimentoBuscar = new Alimento("id2");
        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertNull(alimentoBuscar, "No se ha obtenido el resultado esperado");
    }

    @Test
    public void actualizarAlimentoTiendaTest() {
        Alimento alimentoActualizar = new Alimento(id, nombreActualizar, precioActualizar, fechaEntradaActualizar, fechaCaducidadActualizar);
        tienda.actualizarProducto(alimentoActualizar);
        alimentoActualizar = (Alimento) tienda.obtenerProducto(alimentoActualizar);
        Assertions.assertEquals(nombreActualizar, alimentoActualizar.getNombre(), "No se ha obtenido el resultado esperado");
        Assertions.assertEquals(precioActualizar, alimentoActualizar.getPrecio(), "No se ha obtenido el resultado esperado");
        Assertions.assertEquals(fechaEntradaActualizar, alimentoActualizar.getfEntrada(), "No se ha obtenido el resultado esperado");
        Assertions.assertEquals(fechaCaducidadActualizar, alimentoActualizar.getfCaducidad(), "No se ha obtenido el resultado esperado");
    }


}
