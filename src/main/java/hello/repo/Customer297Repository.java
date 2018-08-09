package hello.repo;

import hello.model.Customer297;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer297Repository extends CrudRepository<Customer297, Long> {

    List<Customer297> findByLastName(String lastName);
}
