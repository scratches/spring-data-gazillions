package hello.repo;

import hello.model.Customer1096;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1096Repository extends CrudRepository<Customer1096, Long> {

    List<Customer1096> findByLastName(String lastName);
}
