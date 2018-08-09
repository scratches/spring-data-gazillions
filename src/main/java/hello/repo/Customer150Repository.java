package hello.repo;

import hello.model.Customer150;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer150Repository extends CrudRepository<Customer150, Long> {

    List<Customer150> findByLastName(String lastName);
}
