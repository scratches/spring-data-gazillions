package hello.repo;

import hello.model.Customer612;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer612Repository extends CrudRepository<Customer612, Long> {

    List<Customer612> findByLastName(String lastName);
}
