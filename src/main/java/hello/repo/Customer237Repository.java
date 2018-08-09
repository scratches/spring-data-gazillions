package hello.repo;

import hello.model.Customer237;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer237Repository extends CrudRepository<Customer237, Long> {

    List<Customer237> findByLastName(String lastName);
}
