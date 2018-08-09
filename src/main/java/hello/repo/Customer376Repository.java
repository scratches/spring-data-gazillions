package hello.repo;

import hello.model.Customer376;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer376Repository extends CrudRepository<Customer376, Long> {

    List<Customer376> findByLastName(String lastName);
}
