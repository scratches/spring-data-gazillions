package hello.repo;

import hello.model.Customer423;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer423Repository extends CrudRepository<Customer423, Long> {

    List<Customer423> findByLastName(String lastName);
}
