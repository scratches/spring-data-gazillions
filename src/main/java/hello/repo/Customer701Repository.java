package hello.repo;

import hello.model.Customer701;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer701Repository extends CrudRepository<Customer701, Long> {

    List<Customer701> findByLastName(String lastName);
}
