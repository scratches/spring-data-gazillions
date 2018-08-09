package hello.repo;

import hello.model.Customer1542;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1542Repository extends CrudRepository<Customer1542, Long> {

    List<Customer1542> findByLastName(String lastName);
}
