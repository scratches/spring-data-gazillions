package hello.repo;

import hello.model.Customer889;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer889Repository extends CrudRepository<Customer889, Long> {

    List<Customer889> findByLastName(String lastName);
}
