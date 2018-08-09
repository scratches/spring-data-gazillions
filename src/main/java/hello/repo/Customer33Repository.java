package hello.repo;

import hello.model.Customer33;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer33Repository extends CrudRepository<Customer33, Long> {

    List<Customer33> findByLastName(String lastName);
}
