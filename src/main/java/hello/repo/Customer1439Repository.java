package hello.repo;

import hello.model.Customer1439;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1439Repository extends CrudRepository<Customer1439, Long> {

    List<Customer1439> findByLastName(String lastName);
}
