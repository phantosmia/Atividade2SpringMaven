package com.raquel.common.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.raquel.common.main.model.Item;



public interface ItemRepository extends CrudRepository<Item, Long>{

}
