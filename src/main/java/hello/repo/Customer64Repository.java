package hello.repo;

import hello.model.Customer64;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer64Repository extends CrudRepository<Customer64, Long> {

    List<Customer64> findByLastName(String lastName);
}
