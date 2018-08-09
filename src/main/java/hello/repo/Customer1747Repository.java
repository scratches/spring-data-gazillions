package hello.repo;

import hello.model.Customer1747;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1747Repository extends CrudRepository<Customer1747, Long> {

    List<Customer1747> findByLastName(String lastName);
}
