package hello.repo;

import hello.model.Customer942;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer942Repository extends CrudRepository<Customer942, Long> {

    List<Customer942> findByLastName(String lastName);
}
