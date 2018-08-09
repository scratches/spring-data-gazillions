package hello.repo;

import hello.model.Customer1809;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1809Repository extends CrudRepository<Customer1809, Long> {

    List<Customer1809> findByLastName(String lastName);
}
