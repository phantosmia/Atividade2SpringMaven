package com.raquel.common.main.service;

import com.raquel.common.main.model.Item;
import com.raquel.common.main.model.Personagem;
import com.raquel.common.main.repository.ItemRepository;

public interface InventarioService {
public void transacaoSave();
public void transacaoDelete();
public void transacaoDeletePersonagem(Personagem personagem);
public void transacaoDeleteItem(Item item);
public boolean isItemRepoNull(ItemRepository itemRepo);
}
