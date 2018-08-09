package hello.repo;

import hello.model.Customer767;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer767Repository extends CrudRepository<Customer767, Long> {

    List<Customer767> findByLastName(String lastName);
}
