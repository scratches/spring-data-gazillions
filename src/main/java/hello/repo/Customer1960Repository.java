package hello.repo;

import hello.model.Customer1960;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1960Repository extends CrudRepository<Customer1960, Long> {

    List<Customer1960> findByLastName(String lastName);
}
