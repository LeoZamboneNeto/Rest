import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestapiApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(RestapiApplication.class);
        springApplication.run(args);
    }
}
