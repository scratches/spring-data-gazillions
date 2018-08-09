package hello.repo;

import hello.model.Customer1468;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1468Repository extends CrudRepository<Customer1468, Long> {

    List<Customer1468> findByLastName(String lastName);
}
