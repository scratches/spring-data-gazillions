package hello.repo;

import hello.model.Customer97;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer97Repository extends CrudRepository<Customer97, Long> {

    List<Customer97> findByLastName(String lastName);
}
