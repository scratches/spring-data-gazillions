package hello.repo;

import hello.model.Customer370;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer370Repository extends CrudRepository<Customer370, Long> {

    List<Customer370> findByLastName(String lastName);
}
