package pe.edu.unsch.dao;

import org.springframework.data.repository.CrudRepository;

import pe.edu.unsch.entities.Cliente;

public interface CrudCliente extends CrudRepository<Cliente, Integer> {

}
