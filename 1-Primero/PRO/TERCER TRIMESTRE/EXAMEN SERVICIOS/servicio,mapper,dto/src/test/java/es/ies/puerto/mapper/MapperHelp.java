package es.ies.puerto.mapper;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.negocio.dto.AliasDTO;
import es.ies.puerto.negocio.dto.EquipamientoDTO;
import es.ies.puerto.negocio.dto.PersonajeDTO;
import es.ies.puerto.negocio.dto.PoderDTO;

public class MapperHelp {
    public static final String idPoder= "1";
    public static final String nombrePoder= "Rayo laser";
    public static final String idAlias="1";
    public static final String idPersonaje="1";
    public static final String descripcionAlias="soy un alias";
    public static final String idEquipamiento= "1";
    public static final String  nombreEquipamiento= "armadura de cojitos";
    public static final String descripcionEquipamiento="armadura protectora para cojos";
    public static final String nombrePersonaje ="albahadmamad";
    public static final String genero ="binario";

    public Personaje personaje;
    public Poder poder;
    public Equipamiento equipamiento;
    public Alias alias;
    public Set<Poder>poderes;
    public Set<Equipamiento>equipamientos;

    public PersonajeDTO personajeDTO;
    public PoderDTO poderDTO;
    public EquipamientoDTO equipamientoDTO;
    public AliasDTO aliasDTO;
    public Set<PoderDTO>poderesDTO;
    public Set<EquipamientoDTO>equipamientosDTO;
    
    @BeforeEach
    public void beforeEach(){
        poder= new Poder(idPoder, nombrePoder);
        poderDTO= new PoderDTO(idPoder, nombrePoder);
        equipamiento = new Equipamiento(idEquipamiento, nombreEquipamiento, descripcionAlias, idPersonaje);
        equipamientoDTO = new EquipamientoDTO(idEquipamiento, nombreEquipamiento, descripcionAlias, idPersonaje);
        alias= new Alias(idAlias, descripcionAlias, idPersonaje);
        aliasDTO= new AliasDTO(idAlias, descripcionAlias, idPersonaje);
        personaje = new Personaje(idPersonaje, nombrePersonaje, genero, alias, equipamientos, poderes);
        personajeDTO = new PersonajeDTO(idPersonaje, nombrePersonaje, genero, alias, equipamientos, poderes);
    }
}
