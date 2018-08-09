package hello.repo;

import hello.model.Customer815;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer815Repository extends CrudRepository<Customer815, Long> {

    List<Customer815> findByLastName(String lastName);
}
