package hello.repo;

import hello.model.Customer1685;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1685Repository extends CrudRepository<Customer1685, Long> {

    List<Customer1685> findByLastName(String lastName);
}
