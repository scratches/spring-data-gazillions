package hello.repo;

import hello.model.Customer1327;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1327Repository extends CrudRepository<Customer1327, Long> {

    List<Customer1327> findByLastName(String lastName);
}
