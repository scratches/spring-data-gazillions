package hello.repo;

import hello.model.Customer350;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer350Repository extends CrudRepository<Customer350, Long> {

    List<Customer350> findByLastName(String lastName);
}
