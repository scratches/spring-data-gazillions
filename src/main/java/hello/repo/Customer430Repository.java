package hello.repo;

import hello.model.Customer430;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer430Repository extends CrudRepository<Customer430, Long> {

    List<Customer430> findByLastName(String lastName);
}
