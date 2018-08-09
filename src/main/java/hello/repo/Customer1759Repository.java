package hello.repo;

import hello.model.Customer1759;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1759Repository extends CrudRepository<Customer1759, Long> {

    List<Customer1759> findByLastName(String lastName);
}
