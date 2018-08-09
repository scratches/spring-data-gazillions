package hello.repo;

import hello.model.Customer1057;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1057Repository extends CrudRepository<Customer1057, Long> {

    List<Customer1057> findByLastName(String lastName);
}
