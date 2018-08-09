package hello.repo;

import hello.model.Customer144;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer144Repository extends CrudRepository<Customer144, Long> {

    List<Customer144> findByLastName(String lastName);
}
