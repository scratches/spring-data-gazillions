package hello.repo;

import hello.model.Customer1036;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1036Repository extends CrudRepository<Customer1036, Long> {

    List<Customer1036> findByLastName(String lastName);
}
