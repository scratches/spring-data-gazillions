package hello.repo;

import hello.model.Customer854;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer854Repository extends CrudRepository<Customer854, Long> {

    List<Customer854> findByLastName(String lastName);
}
