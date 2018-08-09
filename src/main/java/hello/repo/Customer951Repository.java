package hello.repo;

import hello.model.Customer951;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer951Repository extends CrudRepository<Customer951, Long> {

    List<Customer951> findByLastName(String lastName);
}
