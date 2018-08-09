package hello.repo;

import hello.model.Customer972;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer972Repository extends CrudRepository<Customer972, Long> {

    List<Customer972> findByLastName(String lastName);
}
