package hello.repo;

import hello.model.Customer416;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer416Repository extends CrudRepository<Customer416, Long> {

    List<Customer416> findByLastName(String lastName);
}
