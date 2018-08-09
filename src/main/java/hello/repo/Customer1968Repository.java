package hello.repo;

import hello.model.Customer1968;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1968Repository extends CrudRepository<Customer1968, Long> {

    List<Customer1968> findByLastName(String lastName);
}
