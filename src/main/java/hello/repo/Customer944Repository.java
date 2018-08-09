package hello.repo;

import hello.model.Customer944;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer944Repository extends CrudRepository<Customer944, Long> {

    List<Customer944> findByLastName(String lastName);
}
