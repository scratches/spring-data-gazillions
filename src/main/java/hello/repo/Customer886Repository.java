package hello.repo;

import hello.model.Customer886;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer886Repository extends CrudRepository<Customer886, Long> {

    List<Customer886> findByLastName(String lastName);
}
