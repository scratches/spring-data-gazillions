package hello.repo;

import hello.model.Customer636;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer636Repository extends CrudRepository<Customer636, Long> {

    List<Customer636> findByLastName(String lastName);
}
