package hello.repo;

import hello.model.Customer516;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer516Repository extends CrudRepository<Customer516, Long> {

    List<Customer516> findByLastName(String lastName);
}
