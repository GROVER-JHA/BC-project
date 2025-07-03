package bc.bccustomerservice.service;

import bc.bccustomerservice.entity.Cliente;
import java.util.List;

public interface ClienteService {
    List<Cliente> listar();
    Cliente buscarPorDni(String dni);
    Cliente guardar(Cliente cliente);
    void eliminar(String dni);
}