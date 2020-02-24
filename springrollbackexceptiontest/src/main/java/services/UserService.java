package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {

    @Autowired
    private JdbcTemplate jdbc;

    public void addUser() throws Exception {
        jdbc.update("INSERT INTO user VALUES (NULL, ?, ?)", "bill", "12345");
        throw new Exception("Error");
    }
}
