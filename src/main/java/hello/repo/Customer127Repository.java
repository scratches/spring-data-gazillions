package hello.repo;

import hello.model.Customer127;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer127Repository extends CrudRepository<Customer127, Long> {

    List<Customer127> findByLastName(String lastName);
}
