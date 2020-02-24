package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.UserService;

public class Main {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            context.getBean(UserService.class).addUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
