package hello.repo;

import hello.model.Customer229;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer229Repository extends CrudRepository<Customer229, Long> {

    List<Customer229> findByLastName(String lastName);
}
