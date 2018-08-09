package hello.repo;

import hello.model.Customer1447;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1447Repository extends CrudRepository<Customer1447, Long> {

    List<Customer1447> findByLastName(String lastName);
}
