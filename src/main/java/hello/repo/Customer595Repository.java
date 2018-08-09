package hello.repo;

import hello.model.Customer595;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer595Repository extends CrudRepository<Customer595, Long> {

    List<Customer595> findByLastName(String lastName);
}
