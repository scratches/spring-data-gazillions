package hello.repo;

import hello.model.Customer362;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer362Repository extends CrudRepository<Customer362, Long> {

    List<Customer362> findByLastName(String lastName);
}
