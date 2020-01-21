package infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CreateSchema {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void run() throws Exception {

        jdbcTemplate.execute("DROP TABLE IF EXISTS product");
        jdbcTemplate.execute("CREATE TABLE product (\n" +
                "    id   INTEGER      NOT NULL AUTO_INCREMENT,\n" +
                "    name VARCHAR(128) NOT NULL,\n" +
                "    PRIMARY KEY (id)\n" +
                ");");

    }
}
