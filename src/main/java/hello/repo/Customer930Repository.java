package hello.repo;

import hello.model.Customer930;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer930Repository extends CrudRepository<Customer930, Long> {

    List<Customer930> findByLastName(String lastName);
}
