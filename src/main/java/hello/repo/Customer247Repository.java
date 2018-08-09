package hello.repo;

import hello.model.Customer247;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer247Repository extends CrudRepository<Customer247, Long> {

    List<Customer247> findByLastName(String lastName);
}
