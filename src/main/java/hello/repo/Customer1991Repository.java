package hello.repo;

import hello.model.Customer1991;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1991Repository extends CrudRepository<Customer1991, Long> {

    List<Customer1991> findByLastName(String lastName);
}
