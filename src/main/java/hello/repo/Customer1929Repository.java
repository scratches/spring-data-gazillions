package hello.repo;

import hello.model.Customer1929;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1929Repository extends CrudRepository<Customer1929, Long> {

    List<Customer1929> findByLastName(String lastName);
}
