package hello.repo;

import hello.model.Customer580;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer580Repository extends CrudRepository<Customer580, Long> {

    List<Customer580> findByLastName(String lastName);
}
