package Controladores;

import Formularios.Cliente;
import Repositorios.ClienteRepository;
import Servicios.ClienteServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/Clientes")
public class ClienteControlador {
    private final ClienteServicio clienteServicio;

    public ClienteControlador(ClienteServicio clienteServicio) {
        this.clienteServicio= clienteServicio;
    }

    @GetMapping
    public List<Cliente> getClientes() {
        return clienteServicio.listarClientes();
    }

    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return clienteServicio.guardarCliente(cliente);
    }
}

