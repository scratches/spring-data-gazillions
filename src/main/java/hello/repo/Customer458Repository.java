package hello.repo;

import hello.model.Customer458;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer458Repository extends CrudRepository<Customer458, Long> {

    List<Customer458> findByLastName(String lastName);
}
