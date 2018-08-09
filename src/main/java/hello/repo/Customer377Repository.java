package hello.repo;

import hello.model.Customer377;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer377Repository extends CrudRepository<Customer377, Long> {

    List<Customer377> findByLastName(String lastName);
}
