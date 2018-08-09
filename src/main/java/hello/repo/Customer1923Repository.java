package hello.repo;

import hello.model.Customer1923;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1923Repository extends CrudRepository<Customer1923, Long> {

    List<Customer1923> findByLastName(String lastName);
}
