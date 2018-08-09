package hello.repo;

import hello.model.Customer115;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer115Repository extends CrudRepository<Customer115, Long> {

    List<Customer115> findByLastName(String lastName);
}
