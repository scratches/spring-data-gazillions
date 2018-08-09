package hello.repo;

import hello.model.Customer714;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer714Repository extends CrudRepository<Customer714, Long> {

    List<Customer714> findByLastName(String lastName);
}
