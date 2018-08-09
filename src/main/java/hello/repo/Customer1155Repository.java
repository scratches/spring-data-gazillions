package hello.repo;

import hello.model.Customer1155;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1155Repository extends CrudRepository<Customer1155, Long> {

    List<Customer1155> findByLastName(String lastName);
}
