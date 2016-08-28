package com.raquel.common.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raquel.common.main.model.Item;
import com.raquel.common.main.model.Personagem;
import com.raquel.common.main.repository.ItemRepository;
import com.raquel.common.main.repository.PersonagemRepository;



@Service("inventarioService")
public class InventarioServiceImpl implements InventarioService{
	@Autowired
	private PersonagemRepository personagemRepo;
	private ItemRepository itemRepo;

	@Transactional
	public void transacaoSave() {
		// TODO Auto-generated method stub
		Personagem personagem1 = new Personagem();
		personagem1.setNome("Alec");
		personagem1.setClasse("Guerreiro");
		Item item1 = new Item();
		item1.setNome("Espada Flamejante");
		item1.setTipo("Espada");
		personagemRepo.save(personagem1);
	}
	@Transactional
	public void transacaoDelete(){
		personagemRepo.deleteAll();
		itemRepo.deleteAll();
	}
	/**
	 * @param personagemRepo the personagemRepo to set
	 */
	public void setPersonagemRepo(PersonagemRepository personagemRepo) {
		this.personagemRepo = personagemRepo;
	}
	public void setItemRepo(ItemRepository itemRepo){
		this.itemRepo = itemRepo;	 
	}
}
