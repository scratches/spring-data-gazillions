package hello.repo;

import hello.model.Customer738;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer738Repository extends CrudRepository<Customer738, Long> {

    List<Customer738> findByLastName(String lastName);
}
