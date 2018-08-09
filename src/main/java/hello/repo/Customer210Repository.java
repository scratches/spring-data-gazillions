package hello.repo;

import hello.model.Customer210;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer210Repository extends CrudRepository<Customer210, Long> {

    List<Customer210> findByLastName(String lastName);
}
