package bc.bccustomerservice.controller;

import bc.bccustomerservice.entity.Cliente;
import bc.bccustomerservice.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> listar() {
        return clienteService.listar();
    }

    @GetMapping("/{dni}")
    public ResponseEntity<Cliente> obtenerPorDni(@PathVariable String dni) {
        Cliente cliente = clienteService.buscarPorDni(dni);
        return cliente != null ? ResponseEntity.ok(cliente) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Cliente crear(@RequestBody Cliente cliente) {
        return clienteService.guardar(cliente);
    }

    @DeleteMapping("/{dni}")
    public void eliminar(@PathVariable String dni) {
        clienteService.eliminar(dni);
    }
}