package hello.repo;

import hello.model.Customer151;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer151Repository extends CrudRepository<Customer151, Long> {

    List<Customer151> findByLastName(String lastName);
}
