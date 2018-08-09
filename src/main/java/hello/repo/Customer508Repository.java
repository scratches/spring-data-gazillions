package hello.repo;

import hello.model.Customer508;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer508Repository extends CrudRepository<Customer508, Long> {

    List<Customer508> findByLastName(String lastName);
}
