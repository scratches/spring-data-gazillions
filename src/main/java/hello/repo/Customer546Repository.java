package hello.repo;

import hello.model.Customer546;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer546Repository extends CrudRepository<Customer546, Long> {

    List<Customer546> findByLastName(String lastName);
}
