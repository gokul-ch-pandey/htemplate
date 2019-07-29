package com.hikex.htemplate.oauth.server.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hikex.htemplate.oauth.server.entity.Role;

@Repository
@Transactional
public interface OauthRoleRepository extends JpaRepository<Role, Long> {

	List<Role> findAllByName(String roleName);

}
