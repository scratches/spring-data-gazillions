package hello.repo;

import hello.model.Customer695;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer695Repository extends CrudRepository<Customer695, Long> {

    List<Customer695> findByLastName(String lastName);
}
