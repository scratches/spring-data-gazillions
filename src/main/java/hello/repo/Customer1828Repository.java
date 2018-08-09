package hello.repo;

import hello.model.Customer1828;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1828Repository extends CrudRepository<Customer1828, Long> {

    List<Customer1828> findByLastName(String lastName);
}
