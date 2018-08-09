package hello.repo;

import hello.model.Customer1400;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1400Repository extends CrudRepository<Customer1400, Long> {

    List<Customer1400> findByLastName(String lastName);
}
