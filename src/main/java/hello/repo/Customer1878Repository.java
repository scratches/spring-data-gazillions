package hello.repo;

import hello.model.Customer1878;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1878Repository extends CrudRepository<Customer1878, Long> {

    List<Customer1878> findByLastName(String lastName);
}
