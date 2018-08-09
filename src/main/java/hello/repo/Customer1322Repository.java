package hello.repo;

import hello.model.Customer1322;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1322Repository extends CrudRepository<Customer1322, Long> {

    List<Customer1322> findByLastName(String lastName);
}
