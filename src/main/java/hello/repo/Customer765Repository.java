package hello.repo;

import hello.model.Customer765;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer765Repository extends CrudRepository<Customer765, Long> {

    List<Customer765> findByLastName(String lastName);
}
