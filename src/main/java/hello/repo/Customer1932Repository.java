package hello.repo;

import hello.model.Customer1932;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1932Repository extends CrudRepository<Customer1932, Long> {

    List<Customer1932> findByLastName(String lastName);
}
