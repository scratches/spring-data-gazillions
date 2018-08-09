package hello.repo;

import hello.model.Customer568;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer568Repository extends CrudRepository<Customer568, Long> {

    List<Customer568> findByLastName(String lastName);
}
