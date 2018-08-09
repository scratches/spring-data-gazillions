package hello.repo;

import hello.model.Customer1037;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1037Repository extends CrudRepository<Customer1037, Long> {

    List<Customer1037> findByLastName(String lastName);
}
