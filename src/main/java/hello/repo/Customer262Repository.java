package hello.repo;

import hello.model.Customer262;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer262Repository extends CrudRepository<Customer262, Long> {

    List<Customer262> findByLastName(String lastName);
}
