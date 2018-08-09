package hello.repo;

import hello.model.Customer869;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer869Repository extends CrudRepository<Customer869, Long> {

    List<Customer869> findByLastName(String lastName);
}
