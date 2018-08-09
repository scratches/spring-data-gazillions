package hello.repo;

import hello.model.Customer449;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer449Repository extends CrudRepository<Customer449, Long> {

    List<Customer449> findByLastName(String lastName);
}
