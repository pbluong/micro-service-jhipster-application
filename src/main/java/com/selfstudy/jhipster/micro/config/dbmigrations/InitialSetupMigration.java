package com.selfstudy.jhipster.micro.config.dbmigrations;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.selfstudy.jhipster.micro.domain.Authority;
import com.selfstudy.jhipster.micro.domain.User;
import com.selfstudy.jhipster.micro.security.AuthoritiesConstants;
import java.time.Instant;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Creates the initial database setup.
 */
@ChangeLog(order = "001")
public class InitialSetupMigration {

    @ChangeSet(order = "01", author = "initiator", id = "01-addAuthorities")
    public void addAuthorities(MongoTemplate mongoTemplate) {
        Authority adminAuthority = new Authority();
        adminAuthority.setName(AuthoritiesConstants.ADMIN);
        Authority userAuthority = new Authority();
        userAuthority.setName(AuthoritiesConstants.USER);
        mongoTemplate.save(adminAuthority);
        mongoTemplate.save(userAuthority);
    }
}
