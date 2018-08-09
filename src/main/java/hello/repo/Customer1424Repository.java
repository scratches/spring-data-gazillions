package hello.repo;

import hello.model.Customer1424;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1424Repository extends CrudRepository<Customer1424, Long> {

    List<Customer1424> findByLastName(String lastName);
}
