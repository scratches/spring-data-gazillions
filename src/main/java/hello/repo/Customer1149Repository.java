package hello.repo;

import hello.model.Customer1149;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1149Repository extends CrudRepository<Customer1149, Long> {

    List<Customer1149> findByLastName(String lastName);
}
