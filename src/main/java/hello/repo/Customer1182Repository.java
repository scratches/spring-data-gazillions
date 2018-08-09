package hello.repo;

import hello.model.Customer1182;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1182Repository extends CrudRepository<Customer1182, Long> {

    List<Customer1182> findByLastName(String lastName);
}
