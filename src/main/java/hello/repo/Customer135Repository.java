package hello.repo;

import hello.model.Customer135;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer135Repository extends CrudRepository<Customer135, Long> {

    List<Customer135> findByLastName(String lastName);
}
