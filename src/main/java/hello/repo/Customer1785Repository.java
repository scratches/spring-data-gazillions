package hello.repo;

import hello.model.Customer1785;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1785Repository extends CrudRepository<Customer1785, Long> {

    List<Customer1785> findByLastName(String lastName);
}
