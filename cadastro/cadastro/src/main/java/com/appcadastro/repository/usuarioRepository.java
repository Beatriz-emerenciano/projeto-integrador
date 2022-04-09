package com.appcadastro.repository;

 import java.util.List;

 import org.springframework.data.jpa.repository.Query;
 import org.springframework.data.repository.CrudRepository;
 
import com.appcadastro.cadastro.models.usuario;

public interface usuarioRepository   extends CrudRepository<usuario, Long>{
	
	
	// criado para a busca usuario por id ou chave primária
	 usuario findById(long id);
	
	 // criado para a busca usuario por nome
	 usuario findByNome(String nome);
	
	 // Busca para vários nomes do cadastro
	
	 @Query(value = "select u from usuario u where u.nome like %?1%")
	 List<usuario> findByNomes(String nome);

	
	
	

}
