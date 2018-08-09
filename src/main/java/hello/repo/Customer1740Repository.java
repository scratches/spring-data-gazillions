package hello.repo;

import hello.model.Customer1740;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1740Repository extends CrudRepository<Customer1740, Long> {

    List<Customer1740> findByLastName(String lastName);
}
