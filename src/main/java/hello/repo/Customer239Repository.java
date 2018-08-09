package hello.repo;

import hello.model.Customer239;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer239Repository extends CrudRepository<Customer239, Long> {

    List<Customer239> findByLastName(String lastName);
}
