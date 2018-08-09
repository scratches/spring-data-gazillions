package hello.repo;

import hello.model.Customer998;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer998Repository extends CrudRepository<Customer998, Long> {

    List<Customer998> findByLastName(String lastName);
}
