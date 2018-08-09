package hello.repo;

import hello.model.Customer158;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer158Repository extends CrudRepository<Customer158, Long> {

    List<Customer158> findByLastName(String lastName);
}
