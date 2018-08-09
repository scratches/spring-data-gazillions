package hello.repo;

import hello.model.Customer391;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer391Repository extends CrudRepository<Customer391, Long> {

    List<Customer391> findByLastName(String lastName);
}
