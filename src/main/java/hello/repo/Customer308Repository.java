package hello.repo;

import hello.model.Customer308;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer308Repository extends CrudRepository<Customer308, Long> {

    List<Customer308> findByLastName(String lastName);
}
