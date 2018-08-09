package hello.repo;

import hello.model.Customer467;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer467Repository extends CrudRepository<Customer467, Long> {

    List<Customer467> findByLastName(String lastName);
}
