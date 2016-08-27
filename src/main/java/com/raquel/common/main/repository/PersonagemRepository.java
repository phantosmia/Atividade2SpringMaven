package com.raquel.common.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.raquel.common.main.model.Personagem;

public interface PersonagemRepository extends CrudRepository<Personagem, Long>{
	public Personagem findByNome(String nome);
	
	public Personagem findTop1ByNomeContains(String nome);
	
	public List<Personagem> findByIdGreaterThan(Long id);
	
	public List<Personagem> findByItensNome(String nome);
	
	@Query("select p from Personagem p where p.nome like %?1%")
	public List<Personagem> buscaUsuario(String nome);
}
