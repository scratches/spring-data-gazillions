package hello.repo;

import hello.model.Customer1618;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1618Repository extends CrudRepository<Customer1618, Long> {

    List<Customer1618> findByLastName(String lastName);
}
