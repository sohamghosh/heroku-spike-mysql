package org.motechproject.spike;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestService {

    @Autowired
    private BasicDataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String create() {
        jdbcTemplate.update("INSERT INTO USER (NAME, ADDRESS) VALUES (?, ?)", "Soham", "Bangalore");
        return "(MySQL) Created.";
    }

    public String find() {
        long count = jdbcTemplate.queryForLong("SELECT COUNT(*) FROM USER");
        return "(MySQL) Count: " + count;
    }
}
