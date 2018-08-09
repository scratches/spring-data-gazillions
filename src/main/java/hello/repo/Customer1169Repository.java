package hello.repo;

import hello.model.Customer1169;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1169Repository extends CrudRepository<Customer1169, Long> {

    List<Customer1169> findByLastName(String lastName);
}
