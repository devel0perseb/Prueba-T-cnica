package Formularios;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Departamento")

public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;

    @ManyToMany ( mappedBy = "Departamento")
    private List <Ciudad> ciudades;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Pais getPais() { return pais; }
    public void setPais(Pais pais) { this.pais = pais; }

    public List<Ciudad> getCiudades() { return ciudades; }
    public void setCiudades(List<Ciudad> ciudades) { this.ciudades = ciudades; }

}
