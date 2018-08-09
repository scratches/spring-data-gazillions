package hello.repo;

import hello.model.Customer1931;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1931Repository extends CrudRepository<Customer1931, Long> {

    List<Customer1931> findByLastName(String lastName);
}
