package hello.repo;

import hello.model.Customer89;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer89Repository extends CrudRepository<Customer89, Long> {

    List<Customer89> findByLastName(String lastName);
}
