package hello.repo;

import hello.model.Customer1539;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1539Repository extends CrudRepository<Customer1539, Long> {

    List<Customer1539> findByLastName(String lastName);
}
