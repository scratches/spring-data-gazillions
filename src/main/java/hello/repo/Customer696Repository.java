package hello.repo;

import hello.model.Customer696;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer696Repository extends CrudRepository<Customer696, Long> {

    List<Customer696> findByLastName(String lastName);
}
