package hello.repo;

import hello.model.Customer746;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer746Repository extends CrudRepository<Customer746, Long> {

    List<Customer746> findByLastName(String lastName);
}
