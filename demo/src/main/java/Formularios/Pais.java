package Formularios;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToMany (mappedBy = "Pais")
    private List<Departamento> departamentos;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Departamento> getDepartamentos() { return departamentos; }
    public void setDepartamentos(List<Departamento> departamentos) { this.departamentos = departamentos; }
}

