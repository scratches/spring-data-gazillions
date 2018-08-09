package hello.repo;

import hello.model.Customer1530;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1530Repository extends CrudRepository<Customer1530, Long> {

    List<Customer1530> findByLastName(String lastName);
}
