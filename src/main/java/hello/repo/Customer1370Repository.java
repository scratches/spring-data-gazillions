package hello.repo;

import hello.model.Customer1370;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1370Repository extends CrudRepository<Customer1370, Long> {

    List<Customer1370> findByLastName(String lastName);
}
