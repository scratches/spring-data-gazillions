package hello.repo;

import hello.model.Customer1203;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1203Repository extends CrudRepository<Customer1203, Long> {

    List<Customer1203> findByLastName(String lastName);
}
