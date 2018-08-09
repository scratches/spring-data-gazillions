package hello.repo;

import hello.model.Customer806;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer806Repository extends CrudRepository<Customer806, Long> {

    List<Customer806> findByLastName(String lastName);
}
