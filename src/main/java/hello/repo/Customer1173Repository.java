package hello.repo;

import hello.model.Customer1173;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1173Repository extends CrudRepository<Customer1173, Long> {

    List<Customer1173> findByLastName(String lastName);
}
