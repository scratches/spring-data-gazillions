package hello.repo;

import hello.model.Customer1751;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1751Repository extends CrudRepository<Customer1751, Long> {

    List<Customer1751> findByLastName(String lastName);
}
