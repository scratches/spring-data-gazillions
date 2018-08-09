package hello.repo;

import hello.model.Customer1805;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1805Repository extends CrudRepository<Customer1805, Long> {

    List<Customer1805> findByLastName(String lastName);
}
