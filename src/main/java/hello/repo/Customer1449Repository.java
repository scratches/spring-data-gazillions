package hello.repo;

import hello.model.Customer1449;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1449Repository extends CrudRepository<Customer1449, Long> {

    List<Customer1449> findByLastName(String lastName);
}
