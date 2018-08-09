package hello.repo;

import hello.model.Customer1959;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1959Repository extends CrudRepository<Customer1959, Long> {

    List<Customer1959> findByLastName(String lastName);
}
