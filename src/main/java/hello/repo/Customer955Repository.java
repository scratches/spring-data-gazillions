package hello.repo;

import hello.model.Customer955;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer955Repository extends CrudRepository<Customer955, Long> {

    List<Customer955> findByLastName(String lastName);
}
