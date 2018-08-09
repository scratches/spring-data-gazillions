package hello.repo;

import hello.model.Customer575;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer575Repository extends CrudRepository<Customer575, Long> {

    List<Customer575> findByLastName(String lastName);
}
