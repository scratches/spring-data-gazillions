package hello.repo;

import hello.model.Customer1503;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1503Repository extends CrudRepository<Customer1503, Long> {

    List<Customer1503> findByLastName(String lastName);
}
