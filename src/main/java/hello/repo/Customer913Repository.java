package hello.repo;

import hello.model.Customer913;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer913Repository extends CrudRepository<Customer913, Long> {

    List<Customer913> findByLastName(String lastName);
}
