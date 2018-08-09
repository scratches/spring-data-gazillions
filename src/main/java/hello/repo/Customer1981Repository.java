package hello.repo;

import hello.model.Customer1981;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1981Repository extends CrudRepository<Customer1981, Long> {

    List<Customer1981> findByLastName(String lastName);
}
