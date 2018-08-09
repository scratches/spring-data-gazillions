package hello.repo;

import hello.model.Customer965;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer965Repository extends CrudRepository<Customer965, Long> {

    List<Customer965> findByLastName(String lastName);
}
