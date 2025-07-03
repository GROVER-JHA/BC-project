package bc.bccustomerservice.service.impl;

import bc.bccustomerservice.entity.Cliente;
import bc.bccustomerservice.repository.ClienteRepository;
import bc.bccustomerservice.service.ClienteService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorDni(String dni) {
        return clienteRepository.findById(dni).orElse(null);
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void eliminar(String dni) {
        clienteRepository.deleteById(dni);
    }
}