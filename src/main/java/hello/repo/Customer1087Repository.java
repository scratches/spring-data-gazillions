package hello.repo;

import hello.model.Customer1087;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1087Repository extends CrudRepository<Customer1087, Long> {

    List<Customer1087> findByLastName(String lastName);
}
