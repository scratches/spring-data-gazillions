package hello.repo;

import hello.model.Customer106;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer106Repository extends CrudRepository<Customer106, Long> {

    List<Customer106> findByLastName(String lastName);
}
