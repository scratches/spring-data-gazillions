package hello.repo;

import hello.model.Customer587;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer587Repository extends CrudRepository<Customer587, Long> {

    List<Customer587> findByLastName(String lastName);
}
