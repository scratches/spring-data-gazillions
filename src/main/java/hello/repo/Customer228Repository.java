package hello.repo;

import hello.model.Customer228;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer228Repository extends CrudRepository<Customer228, Long> {

    List<Customer228> findByLastName(String lastName);
}
