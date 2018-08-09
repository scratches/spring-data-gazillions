package hello.repo;

import hello.model.Customer1237;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1237Repository extends CrudRepository<Customer1237, Long> {

    List<Customer1237> findByLastName(String lastName);
}
