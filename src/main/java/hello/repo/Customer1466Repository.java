package hello.repo;

import hello.model.Customer1466;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1466Repository extends CrudRepository<Customer1466, Long> {

    List<Customer1466> findByLastName(String lastName);
}
