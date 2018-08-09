package hello.repo;

import hello.model.Customer374;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer374Repository extends CrudRepository<Customer374, Long> {

    List<Customer374> findByLastName(String lastName);
}
