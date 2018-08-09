package hello.repo;

import hello.model.Customer1622;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1622Repository extends CrudRepository<Customer1622, Long> {

    List<Customer1622> findByLastName(String lastName);
}
