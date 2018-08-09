package hello.repo;

import hello.model.Customer1985;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1985Repository extends CrudRepository<Customer1985, Long> {

    List<Customer1985> findByLastName(String lastName);
}
