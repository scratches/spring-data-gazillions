package hello.repo;

import hello.model.Customer1887;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1887Repository extends CrudRepository<Customer1887, Long> {

    List<Customer1887> findByLastName(String lastName);
}
