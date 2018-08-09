package hello.repo;

import hello.model.Customer1711;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1711Repository extends CrudRepository<Customer1711, Long> {

    List<Customer1711> findByLastName(String lastName);
}
