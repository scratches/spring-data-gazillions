package hello.repo;

import hello.model.Customer291;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer291Repository extends CrudRepository<Customer291, Long> {

    List<Customer291> findByLastName(String lastName);
}
