package com.raquel.common.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raquel.common.main.model.Personagem;
import com.raquel.common.main.repository.PersonagemRepository;



@Service("inventarioService")
public class InventarioServiceImpl implements InventarioService{
	@Autowired
	private PersonagemRepository personagemRepo;

	@Transactional
	public void transacaoSave() {
		// TODO Auto-generated method stub
		Personagem personagem1 = new Personagem();
		personagem1.setNome("Alec");
		personagem1.setClasse("Guerreiro");
		
		personagemRepo.save(personagem1);
	}
	/**
	 * @param personagemRepo the personagemRepo to set
	 */
	public void setPersonagemRepo(PersonagemRepository personagemRepo) {
		this.personagemRepo = personagemRepo;
	}
}
