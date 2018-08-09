package hello.repo;

import hello.model.Customer908;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer908Repository extends CrudRepository<Customer908, Long> {

    List<Customer908> findByLastName(String lastName);
}
