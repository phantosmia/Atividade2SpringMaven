package repository;

import org.springframework.data.repository.CrudRepository;

import model.Item;



public interface ItemRepository extends CrudRepository<Item, Long>{

}
