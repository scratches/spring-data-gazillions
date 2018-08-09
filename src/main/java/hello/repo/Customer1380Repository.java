package hello.repo;

import hello.model.Customer1380;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1380Repository extends CrudRepository<Customer1380, Long> {

    List<Customer1380> findByLastName(String lastName);
}
