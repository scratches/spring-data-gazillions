package hello.repo;

import hello.model.Customer1691;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1691Repository extends CrudRepository<Customer1691, Long> {

    List<Customer1691> findByLastName(String lastName);
}
