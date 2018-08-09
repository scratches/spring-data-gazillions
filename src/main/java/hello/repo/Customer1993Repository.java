package hello.repo;

import hello.model.Customer1993;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1993Repository extends CrudRepository<Customer1993, Long> {

    List<Customer1993> findByLastName(String lastName);
}
