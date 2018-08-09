package hello.repo;

import hello.model.Customer845;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer845Repository extends CrudRepository<Customer845, Long> {

    List<Customer845> findByLastName(String lastName);
}
