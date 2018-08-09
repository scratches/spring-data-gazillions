package hello.repo;

import hello.model.Customer264;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer264Repository extends CrudRepository<Customer264, Long> {

    List<Customer264> findByLastName(String lastName);
}
