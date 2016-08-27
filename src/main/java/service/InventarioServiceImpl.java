package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import model.Personagem;
import repository.PersonagemRepository;



@Service("inventarioService")
public class InventarioServiceImpl implements InventarioService{
	@Autowired
	private PersonagemRepository personagemRepo;
	public void transacaoSave() {
		// TODO Auto-generated method stub
		Personagem personagem1 = new Personagem();
		personagem1.setNome("Alec Tanamatis");
		personagem1.setClasse("Guerreiro");
		
		personagemRepo.save(personagem1);
	}

}
