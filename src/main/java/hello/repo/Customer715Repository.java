package hello.repo;

import hello.model.Customer715;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer715Repository extends CrudRepository<Customer715, Long> {

    List<Customer715> findByLastName(String lastName);
}
