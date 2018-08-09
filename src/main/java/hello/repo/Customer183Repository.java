package hello.repo;

import hello.model.Customer183;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer183Repository extends CrudRepository<Customer183, Long> {

    List<Customer183> findByLastName(String lastName);
}
