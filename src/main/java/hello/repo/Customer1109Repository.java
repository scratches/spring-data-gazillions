package hello.repo;

import hello.model.Customer1109;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1109Repository extends CrudRepository<Customer1109, Long> {

    List<Customer1109> findByLastName(String lastName);
}
