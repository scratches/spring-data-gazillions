package hello.repo;

import hello.model.Customer1781;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1781Repository extends CrudRepository<Customer1781, Long> {

    List<Customer1781> findByLastName(String lastName);
}
