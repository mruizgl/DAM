package es.ies.puerto.model.impl;

import java.util.Set;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "Personajes")
public class Personaje implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    @Column(name = "nombre")
    private String nombre;

    @OneToOne(mappedBy = "personaje")
    private Alias alias;

    @Column(name = "genero")
    private String genero;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Personajes_Poderes",joinColumns =
    @JoinColumn(name="personaje_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="poder_id",referencedColumnName = "id"))
    private Set<Poder> poderes;


    public Personaje() {
    }


    public Personaje(Integer id, String nombre, Alias alias, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
    }


    public Personaje(Integer id, String nombre, Alias alias, String genero, Set<Poder> poderes) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }


    public Personaje(int id) {
        this.id=id;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alias getAlias() {
        return this.alias;
    }

    public void setAlias(Alias alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Set<Poder> getPoderes() {
        return this.poderes;
    }

    public void setPoderes(Set<Poder> poderes) {
        this.poderes = poderes;
    }



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Personaje)) {
            return false;
        }
        Personaje personaje = (Personaje) o;
        return Objects.equals(id, personaje.id);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return "{" +
                " id='" + id + "'" +
                ", nombre='" + nombre + "'" +
                ", alias='" + alias + "'" +
                ", genero='" + genero + "'" +
                ", poderes='" + poderes + "'" +
                "}";
    }

}
