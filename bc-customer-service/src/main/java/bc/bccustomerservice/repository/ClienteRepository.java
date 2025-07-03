package bc.bccustomerservice.repository;

import bc.bccustomerservice.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente, String> {
}