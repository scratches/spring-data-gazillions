package hello.repo;

import hello.model.Customer905;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer905Repository extends CrudRepository<Customer905, Long> {

    List<Customer905> findByLastName(String lastName);
}
