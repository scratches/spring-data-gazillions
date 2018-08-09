package hello.repo;

import hello.model.Customer1576;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1576Repository extends CrudRepository<Customer1576, Long> {

    List<Customer1576> findByLastName(String lastName);
}
