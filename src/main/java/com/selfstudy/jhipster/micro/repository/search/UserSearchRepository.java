package com.selfstudy.jhipster.micro.repository.search;

import com.selfstudy.jhipster.micro.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {}
