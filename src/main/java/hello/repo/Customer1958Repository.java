package hello.repo;

import hello.model.Customer1958;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1958Repository extends CrudRepository<Customer1958, Long> {

    List<Customer1958> findByLastName(String lastName);
}
