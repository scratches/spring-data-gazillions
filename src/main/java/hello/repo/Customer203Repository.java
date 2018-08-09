package hello.repo;

import hello.model.Customer203;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer203Repository extends CrudRepository<Customer203, Long> {

    List<Customer203> findByLastName(String lastName);
}
