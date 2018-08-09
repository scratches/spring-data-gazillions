package hello.repo;

import hello.model.Customer1120;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1120Repository extends CrudRepository<Customer1120, Long> {

    List<Customer1120> findByLastName(String lastName);
}
