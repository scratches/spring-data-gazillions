package hello.repo;

import hello.model.Customer882;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer882Repository extends CrudRepository<Customer882, Long> {

    List<Customer882> findByLastName(String lastName);
}
