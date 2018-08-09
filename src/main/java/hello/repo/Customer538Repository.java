package hello.repo;

import hello.model.Customer538;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer538Repository extends CrudRepository<Customer538, Long> {

    List<Customer538> findByLastName(String lastName);
}
