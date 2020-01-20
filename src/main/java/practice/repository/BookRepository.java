package practice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import practice.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}
