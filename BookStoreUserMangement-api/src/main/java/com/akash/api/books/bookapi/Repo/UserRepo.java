package com.akash.api.books.bookapi.Repo;
import com.akash.api.books.bookapi.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
