package hello.repo;

import hello.model.Customer353;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer353Repository extends CrudRepository<Customer353, Long> {

    List<Customer353> findByLastName(String lastName);
}
