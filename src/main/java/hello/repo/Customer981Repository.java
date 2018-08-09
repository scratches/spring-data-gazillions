package hello.repo;

import hello.model.Customer981;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer981Repository extends CrudRepository<Customer981, Long> {

    List<Customer981> findByLastName(String lastName);
}
