package hello.repo;

import hello.model.Customer656;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer656Repository extends CrudRepository<Customer656, Long> {

    List<Customer656> findByLastName(String lastName);
}
