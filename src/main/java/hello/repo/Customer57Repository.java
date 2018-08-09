package hello.repo;

import hello.model.Customer57;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer57Repository extends CrudRepository<Customer57, Long> {

    List<Customer57> findByLastName(String lastName);
}
