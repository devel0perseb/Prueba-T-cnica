package Repositorios;

import Formularios.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepositorio extends JpaRepository <Ciudad,Long> {
}
