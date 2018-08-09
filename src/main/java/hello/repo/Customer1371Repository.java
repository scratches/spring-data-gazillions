package hello.repo;

import hello.model.Customer1371;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1371Repository extends CrudRepository<Customer1371, Long> {

    List<Customer1371> findByLastName(String lastName);
}
