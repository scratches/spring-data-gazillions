package hello.repo;

import hello.model.Customer1156;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1156Repository extends CrudRepository<Customer1156, Long> {

    List<Customer1156> findByLastName(String lastName);
}
