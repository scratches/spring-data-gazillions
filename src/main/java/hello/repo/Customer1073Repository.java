package hello.repo;

import hello.model.Customer1073;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1073Repository extends CrudRepository<Customer1073, Long> {

    List<Customer1073> findByLastName(String lastName);
}
