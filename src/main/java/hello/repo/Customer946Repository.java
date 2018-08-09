package hello.repo;

import hello.model.Customer946;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer946Repository extends CrudRepository<Customer946, Long> {

    List<Customer946> findByLastName(String lastName);
}
