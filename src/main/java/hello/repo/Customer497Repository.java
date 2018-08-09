package hello.repo;

import hello.model.Customer497;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer497Repository extends CrudRepository<Customer497, Long> {

    List<Customer497> findByLastName(String lastName);
}
