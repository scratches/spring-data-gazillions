package hello.repo;

import hello.model.Customer35;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer35Repository extends CrudRepository<Customer35, Long> {

    List<Customer35> findByLastName(String lastName);
}
