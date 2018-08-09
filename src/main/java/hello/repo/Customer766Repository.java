package hello.repo;

import hello.model.Customer766;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer766Repository extends CrudRepository<Customer766, Long> {

    List<Customer766> findByLastName(String lastName);
}
