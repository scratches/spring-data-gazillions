package hello.repo;

import hello.model.Customer110;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer110Repository extends CrudRepository<Customer110, Long> {

    List<Customer110> findByLastName(String lastName);
}
