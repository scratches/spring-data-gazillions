package hello.repo;

import hello.model.Customer1534;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1534Repository extends CrudRepository<Customer1534, Long> {

    List<Customer1534> findByLastName(String lastName);
}
