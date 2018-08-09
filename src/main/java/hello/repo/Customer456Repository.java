package hello.repo;

import hello.model.Customer456;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer456Repository extends CrudRepository<Customer456, Long> {

    List<Customer456> findByLastName(String lastName);
}
