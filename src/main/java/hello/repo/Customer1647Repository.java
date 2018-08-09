package hello.repo;

import hello.model.Customer1647;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1647Repository extends CrudRepository<Customer1647, Long> {

    List<Customer1647> findByLastName(String lastName);
}
