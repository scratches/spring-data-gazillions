package hello.repo;

import hello.model.Customer200;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer200Repository extends CrudRepository<Customer200, Long> {

    List<Customer200> findByLastName(String lastName);
}
