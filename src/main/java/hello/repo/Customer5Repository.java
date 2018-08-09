package hello.repo;

import hello.model.Customer5;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer5Repository extends CrudRepository<Customer5, Long> {

    List<Customer5> findByLastName(String lastName);
}
