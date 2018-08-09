package hello.repo;

import hello.model.Customer788;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer788Repository extends CrudRepository<Customer788, Long> {

    List<Customer788> findByLastName(String lastName);
}
