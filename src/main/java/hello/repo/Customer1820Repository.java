package hello.repo;

import hello.model.Customer1820;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1820Repository extends CrudRepository<Customer1820, Long> {

    List<Customer1820> findByLastName(String lastName);
}
