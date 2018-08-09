package hello.repo;

import hello.model.Customer665;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer665Repository extends CrudRepository<Customer665, Long> {

    List<Customer665> findByLastName(String lastName);
}
