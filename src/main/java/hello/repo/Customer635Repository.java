package hello.repo;

import hello.model.Customer635;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer635Repository extends CrudRepository<Customer635, Long> {

    List<Customer635> findByLastName(String lastName);
}
