package com.supergroup.reddot.repository;

import com.supergroup.reddot.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {

    Link findByTitle(String title);

}
