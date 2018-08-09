package hello.repo;

import hello.model.Customer1704;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1704Repository extends CrudRepository<Customer1704, Long> {

    List<Customer1704> findByLastName(String lastName);
}
