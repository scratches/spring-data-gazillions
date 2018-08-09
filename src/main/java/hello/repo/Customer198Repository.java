package hello.repo;

import hello.model.Customer198;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer198Repository extends CrudRepository<Customer198, Long> {

    List<Customer198> findByLastName(String lastName);
}
