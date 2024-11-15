package es.ies.puerto.services;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.struct.IMapperAlias;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;

import java.util.HashSet;
import java.util.Set;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class AliasServiceTest {

    @Mock
    private DaoAlias daoAlias;

    @InjectMocks
    private AliasService aliasService;

    @BeforeEach
    public void setUp() throws MarvelException {
        MockitoAnnotations.initMocks(this);
        aliasService = new AliasService(daoAlias);
    }

    @Test
    public void testGetObjectById_Success() throws MarvelException {
        String id = "1";
        Alias alias = new Alias(id);
        AliasDTO aliasDTO = new AliasDTO(id);

        when(daoAlias.findAlias(any(Alias.class))).thenReturn(alias);
        when(IMapperAlias.INSTANCE.aliasToAliasDTO(alias)).thenReturn(aliasDTO);

        Response response = aliasService.getObjectById(id);

        Assertions.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }

    @Test
    public void testGetObjectById_NotFound() throws MarvelException {
        String id = "1";

        when(daoAlias.findAlias(any(Alias.class))).thenReturn(null);

        Response response = aliasService.getObjectById(id);

        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    public void testGetAll() throws MarvelException {
        Set<Alias> aliases = new HashSet<>();
        aliases.add(new Alias("1"));
        aliases.add(new Alias("2"));

        Set<AliasDTO> aliasDTOs = new HashSet<>();
        aliasDTOs.add(new AliasDTO("1"));
        aliasDTOs.add(new AliasDTO("2"));

        when(daoAlias.findAllAlias()).thenReturn(aliases);
        when(IMapperAlias.INSTANCE.aliasToAliasDTO(any(Alias.class)))
                .thenAnswer(invocation -> {
                    Alias alias = invocation.getArgument(0);
                    return new AliasDTO(alias.getId());
                });

        Response response = aliasService.getAll();

        Assertions.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }

    @Test
    public void testAddObject_Success() throws MarvelException {
        AliasDTO aliasDTO = new AliasDTO("1");
        Alias alias = new Alias("1");

        when(IMapperAlias.INSTANCE.aliasDTOToAlias(aliasDTO)).thenReturn(alias);
        when(daoAlias.updateAlias(alias)).thenReturn(true);

        Response response = aliasService.addObject(aliasDTO);

        Assertions.assertEquals(Response.Status.CREATED.getStatusCode(), response.getStatus());
    }

    @Test
    public void testAddObject_NotModified() throws MarvelException {
        AliasDTO aliasDTO = new AliasDTO("1");
        Alias alias = new Alias("1");

        when(IMapperAlias.INSTANCE.aliasDTOToAlias(aliasDTO)).thenReturn(alias);
        when(daoAlias.updateAlias(alias)).thenReturn(false);

        Response response = aliasService.addObject(aliasDTO);

        Assertions.assertEquals(Response.Status.NOT_MODIFIED.getStatusCode(), response.getStatus());
    }

    @Test
    public void testDeleteObjectById_Success() throws MarvelException {
        String id = "1";
        Alias alias = new Alias(id);

        when(IMapperAlias.INSTANCE.aliasDTOToAlias(any(AliasDTO.class))).thenReturn(alias);
        when(daoAlias.deleteAlias(alias)).thenReturn(true);

        Response response = aliasService.deleteObjectById(id);

        Assertions.assertEquals(Response.Status.NO_CONTENT.getStatusCode(), response.getStatus());
    }

    @Test
    public void testDeleteObjectById_NotFound() throws MarvelException {
        String id = "1";
        Alias alias = new Alias(id);

        when(IMapperAlias.INSTANCE.aliasDTOToAlias(any(AliasDTO.class))).thenReturn(alias);
        when(daoAlias.deleteAlias(alias)).thenReturn(false);

        Response response = aliasService.deleteObjectById(id);

        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    public void testGetObjectXml_Success() throws MarvelException {
        String id = "1";
        Alias alias = new Alias(id);
        AliasDTO aliasDTO = new AliasDTO(id);

        when(IMapperAlias.INSTANCE.aliasDTOToAlias(aliasDTO)).thenReturn(alias);
        when(daoAlias.findAlias(alias)).thenReturn(alias);

        Response response = aliasService.getObjectXml(id);

        Assertions.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }

    @Test
    public void testGetObjectXml_NotFound() throws MarvelException {
        String id = "1";
        Alias alias = new Alias(id);
        AliasDTO aliasDTO = new AliasDTO(id);

        when(IMapperAlias.INSTANCE.aliasDTOToAlias(aliasDTO)).thenReturn(alias);
        when(daoAlias.findAlias(alias)).thenReturn(null);

        Response response = aliasService.getObjectXml(id);

        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }
}
