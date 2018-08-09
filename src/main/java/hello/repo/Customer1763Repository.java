package hello.repo;

import hello.model.Customer1763;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1763Repository extends CrudRepository<Customer1763, Long> {

    List<Customer1763> findByLastName(String lastName);
}
