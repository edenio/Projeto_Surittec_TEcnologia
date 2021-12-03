package com.surittec.CadCliente.repositories;

import org.springframework.data.repository.CrudRepository;

import com.surittec.CadCliente.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {
	
	Usuario findByLogin(String login);

}
