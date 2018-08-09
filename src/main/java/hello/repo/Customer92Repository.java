package hello.repo;

import hello.model.Customer92;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer92Repository extends CrudRepository<Customer92, Long> {

    List<Customer92> findByLastName(String lastName);
}
