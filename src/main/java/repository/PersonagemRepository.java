package repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import model.Personagem;

public interface PersonagemRepository extends CrudRepository<Personagem, Long>{
	public Personagem findByNome(String nome);
	
	public Personagem findTop1ByNomeContains(String nome);
	
	public List<Personagem> findByIdGreaterThan(Long id);
	
	public List<Personagem> findByAutorizacoesNome(String nome);
	
	@Query("select u from Personagem p where p.nome like %?1%")
	public List<Personagem> buscaUsuario(String nome);
}
