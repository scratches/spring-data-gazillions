package hello.repo;

import hello.model.Customer1071;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1071Repository extends CrudRepository<Customer1071, Long> {

    List<Customer1071> findByLastName(String lastName);
}
