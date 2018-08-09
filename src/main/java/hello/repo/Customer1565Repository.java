package hello.repo;

import hello.model.Customer1565;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1565Repository extends CrudRepository<Customer1565, Long> {

    List<Customer1565> findByLastName(String lastName);
}
