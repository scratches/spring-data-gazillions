package hello.repo;

import hello.model.Customer1568;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1568Repository extends CrudRepository<Customer1568, Long> {

    List<Customer1568> findByLastName(String lastName);
}
