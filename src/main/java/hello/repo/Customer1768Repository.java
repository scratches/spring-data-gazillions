package hello.repo;

import hello.model.Customer1768;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1768Repository extends CrudRepository<Customer1768, Long> {

    List<Customer1768> findByLastName(String lastName);
}
