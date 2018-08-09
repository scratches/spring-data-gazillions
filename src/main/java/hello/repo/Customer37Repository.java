package hello.repo;

import hello.model.Customer37;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer37Repository extends CrudRepository<Customer37, Long> {

    List<Customer37> findByLastName(String lastName);
}
