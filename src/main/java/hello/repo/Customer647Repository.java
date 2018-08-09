package hello.repo;

import hello.model.Customer647;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer647Repository extends CrudRepository<Customer647, Long> {

    List<Customer647> findByLastName(String lastName);
}
