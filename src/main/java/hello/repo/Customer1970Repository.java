package hello.repo;

import hello.model.Customer1970;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1970Repository extends CrudRepository<Customer1970, Long> {

    List<Customer1970> findByLastName(String lastName);
}
