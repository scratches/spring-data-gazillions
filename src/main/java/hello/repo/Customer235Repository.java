package hello.repo;

import hello.model.Customer235;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer235Repository extends CrudRepository<Customer235, Long> {

    List<Customer235> findByLastName(String lastName);
}
