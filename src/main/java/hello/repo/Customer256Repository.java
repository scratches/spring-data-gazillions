package hello.repo;

import hello.model.Customer256;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer256Repository extends CrudRepository<Customer256, Long> {

    List<Customer256> findByLastName(String lastName);
}
