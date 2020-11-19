package pe.edu.unsch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import pe.edu.unsch.dao.CrudCliente;
import pe.edu.unsch.entities.Cliente;
import pe.edu.unsch.service.common.GenericServiceImpl;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Integer> implements ClienteService{

	@Autowired
	private CrudCliente crudCliente;

	@Override
	public CrudRepository<Cliente, Integer> getDao() {
		// TODO Auto-generated method stub
		return crudCliente;
	}

}
