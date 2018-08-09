package hello.repo;

import hello.model.Customer864;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer864Repository extends CrudRepository<Customer864, Long> {

    List<Customer864> findByLastName(String lastName);
}
