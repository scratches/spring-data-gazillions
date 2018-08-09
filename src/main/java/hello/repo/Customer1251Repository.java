package hello.repo;

import hello.model.Customer1251;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1251Repository extends CrudRepository<Customer1251, Long> {

    List<Customer1251> findByLastName(String lastName);
}
