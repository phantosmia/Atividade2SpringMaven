package com.raquel.common.main;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raquel.common.main.model.Item;
import com.raquel.common.main.model.Personagem;
import com.raquel.common.main.repository.ItemRepository;
import com.raquel.common.main.repository.PersonagemRepository;
import com.raquel.common.main.service.InventarioService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
		 
		ItemRepository itemRepo = (ItemRepository) context.getBean("itemRepository");
		PersonagemRepository personagemRepo = (PersonagemRepository) context.getBean("personagemRepository");
		Item item1 = new Item();
		item1.setNome("Espada Flamejante");
		item1.setTipo("Espada");
		itemRepo.save(item1);
		Personagem personagem = new Personagem();
		personagem.setNome("Alec");
		personagem.setClasse("Guerreiro");
		personagem.setItens(new ArrayList<Item>());
		personagem.getItens().add(item1);
		
		personagemRepo.save(personagem);
		
		System.out.println("Id: " + personagem.getId());
		System.out.println("Resultado da busca 1: " + personagemRepo.findByNome("Alec").getNome());
		
		System.out.println("Resultado da busca 2: " + personagemRepo.findTop1ByNomeContains("ec").getNome());

		for(Personagem p: personagemRepo.findByIdGreaterThan(0l)) {
			System.out.println("Personagem encontrado: " + p.getNome());
		}
		
		for(Personagem p: personagemRepo.findByItensNome("Personagem")) {
			System.out.println("Personagem encontrado 2: " + p.getNome());
		}
		
		for(Personagem p: personagemRepo.buscaUsuario("lec")) {
			System.out.println("Usuario encontrado 3: " + p.getNome());
		}
		InventarioService service2 = (InventarioService)context.getBean("inventarioService");
		InventarioService service = (InventarioService)context.getBean("inventarioService");
		System.out.println(service.isItemRepoNull(itemRepo));
		try {
			service.transacaoSave();
			service2.transacaoDelete();
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		//personagemRepo.delete(personagem);

		//itemRepo.delete(item1);
	

    }
}
