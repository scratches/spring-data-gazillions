package hello.repo;

import hello.model.Customer310;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer310Repository extends CrudRepository<Customer310, Long> {

    List<Customer310> findByLastName(String lastName);
}
