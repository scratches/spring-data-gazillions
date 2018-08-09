package hello.repo;

import hello.model.Customer851;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer851Repository extends CrudRepository<Customer851, Long> {

    List<Customer851> findByLastName(String lastName);
}
