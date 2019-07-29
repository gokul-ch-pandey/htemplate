package com.hikex.htemplate.oauth.server.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hikex.htemplate.oauth.server.entity.User;

@Repository
@Transactional
public interface OauthUserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
