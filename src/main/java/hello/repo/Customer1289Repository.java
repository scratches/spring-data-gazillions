package hello.repo;

import hello.model.Customer1289;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1289Repository extends CrudRepository<Customer1289, Long> {

    List<Customer1289> findByLastName(String lastName);
}
