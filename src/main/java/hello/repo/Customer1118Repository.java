package hello.repo;

import hello.model.Customer1118;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1118Repository extends CrudRepository<Customer1118, Long> {

    List<Customer1118> findByLastName(String lastName);
}
