package hello.repo;

import hello.model.Customer912;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer912Repository extends CrudRepository<Customer912, Long> {

    List<Customer912> findByLastName(String lastName);
}
