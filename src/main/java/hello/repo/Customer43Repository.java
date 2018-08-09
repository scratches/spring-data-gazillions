package hello.repo;

import hello.model.Customer43;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer43Repository extends CrudRepository<Customer43, Long> {

    List<Customer43> findByLastName(String lastName);
}
