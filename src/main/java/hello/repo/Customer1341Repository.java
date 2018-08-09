package hello.repo;

import hello.model.Customer1341;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1341Repository extends CrudRepository<Customer1341, Long> {

    List<Customer1341> findByLastName(String lastName);
}
