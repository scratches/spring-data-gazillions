package hello.repo;

import hello.model.Customer296;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer296Repository extends CrudRepository<Customer296, Long> {

    List<Customer296> findByLastName(String lastName);
}
