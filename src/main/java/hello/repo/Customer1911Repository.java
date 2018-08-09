package hello.repo;

import hello.model.Customer1911;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1911Repository extends CrudRepository<Customer1911, Long> {

    List<Customer1911> findByLastName(String lastName);
}
