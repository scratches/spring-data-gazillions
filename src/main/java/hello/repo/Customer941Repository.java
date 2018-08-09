package hello.repo;

import hello.model.Customer941;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer941Repository extends CrudRepository<Customer941, Long> {

    List<Customer941> findByLastName(String lastName);
}
