package Queries;

import org.springframework.data.repository.CrudRepository;

import Entities.AddressEntity;

public interface AddressQuery extends CrudRepository<AddressEntity, String>{

}
