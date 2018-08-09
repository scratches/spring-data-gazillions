package hello.repo;

import hello.model.Customer1890;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1890Repository extends CrudRepository<Customer1890, Long> {

    List<Customer1890> findByLastName(String lastName);
}
