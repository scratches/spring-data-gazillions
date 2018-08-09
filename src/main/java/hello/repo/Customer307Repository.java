package hello.repo;

import hello.model.Customer307;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer307Repository extends CrudRepository<Customer307, Long> {

    List<Customer307> findByLastName(String lastName);
}
