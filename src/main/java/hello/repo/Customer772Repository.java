package hello.repo;

import hello.model.Customer772;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer772Repository extends CrudRepository<Customer772, Long> {

    List<Customer772> findByLastName(String lastName);
}
