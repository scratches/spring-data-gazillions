package hello.repo;

import hello.model.Customer358;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer358Repository extends CrudRepository<Customer358, Long> {

    List<Customer358> findByLastName(String lastName);
}
