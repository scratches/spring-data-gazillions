package hello.repo;

import hello.model.Customer1492;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1492Repository extends CrudRepository<Customer1492, Long> {

    List<Customer1492> findByLastName(String lastName);
}
