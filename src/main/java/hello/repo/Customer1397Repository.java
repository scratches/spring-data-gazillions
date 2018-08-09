package hello.repo;

import hello.model.Customer1397;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1397Repository extends CrudRepository<Customer1397, Long> {

    List<Customer1397> findByLastName(String lastName);
}
