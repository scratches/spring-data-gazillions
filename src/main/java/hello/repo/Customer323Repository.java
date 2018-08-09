package hello.repo;

import hello.model.Customer323;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer323Repository extends CrudRepository<Customer323, Long> {

    List<Customer323> findByLastName(String lastName);
}
