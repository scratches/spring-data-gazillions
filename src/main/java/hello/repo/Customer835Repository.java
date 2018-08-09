package hello.repo;

import hello.model.Customer835;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer835Repository extends CrudRepository<Customer835, Long> {

    List<Customer835> findByLastName(String lastName);
}
