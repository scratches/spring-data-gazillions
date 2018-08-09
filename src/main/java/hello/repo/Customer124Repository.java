package hello.repo;

import hello.model.Customer124;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer124Repository extends CrudRepository<Customer124, Long> {

    List<Customer124> findByLastName(String lastName);
}
