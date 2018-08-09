package hello.repo;

import hello.model.Customer147;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer147Repository extends CrudRepository<Customer147, Long> {

    List<Customer147> findByLastName(String lastName);
}
