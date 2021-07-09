package repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //@Transactional(propagation = Propagation.REQUIRED)	// default, no records are entered
    @Transactional(propagation = Propagation.REQUIRES_NEW)  
    // 6 transactions are being created
    public void addProduct(String name) {
        String sql = "INSERT INTO product VALUES (NULL, ?)";
        jdbcTemplate.update(sql, name);
    }
}
