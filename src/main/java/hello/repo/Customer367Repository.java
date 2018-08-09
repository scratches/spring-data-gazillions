package hello.repo;

import hello.model.Customer367;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer367Repository extends CrudRepository<Customer367, Long> {

    List<Customer367> findByLastName(String lastName);
}
