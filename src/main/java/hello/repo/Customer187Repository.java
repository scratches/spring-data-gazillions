package hello.repo;

import hello.model.Customer187;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer187Repository extends CrudRepository<Customer187, Long> {

    List<Customer187> findByLastName(String lastName);
}
