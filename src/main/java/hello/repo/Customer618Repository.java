package hello.repo;

import hello.model.Customer618;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer618Repository extends CrudRepository<Customer618, Long> {

    List<Customer618> findByLastName(String lastName);
}
