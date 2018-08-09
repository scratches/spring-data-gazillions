package hello.repo;

import hello.model.Customer530;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer530Repository extends CrudRepository<Customer530, Long> {

    List<Customer530> findByLastName(String lastName);
}
