package hello.repo;

import hello.model.Customer790;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer790Repository extends CrudRepository<Customer790, Long> {

    List<Customer790> findByLastName(String lastName);
}
