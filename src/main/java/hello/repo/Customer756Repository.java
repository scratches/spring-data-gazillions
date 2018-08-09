package hello.repo;

import hello.model.Customer756;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer756Repository extends CrudRepository<Customer756, Long> {

    List<Customer756> findByLastName(String lastName);
}
