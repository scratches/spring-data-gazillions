package hello.repo;

import hello.model.Customer1638;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1638Repository extends CrudRepository<Customer1638, Long> {

    List<Customer1638> findByLastName(String lastName);
}
