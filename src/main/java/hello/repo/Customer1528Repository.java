package hello.repo;

import hello.model.Customer1528;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1528Repository extends CrudRepository<Customer1528, Long> {

    List<Customer1528> findByLastName(String lastName);
}
