package hello.repo;

import hello.model.Customer152;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer152Repository extends CrudRepository<Customer152, Long> {

    List<Customer152> findByLastName(String lastName);
}
