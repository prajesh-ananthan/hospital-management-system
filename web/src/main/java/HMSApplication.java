import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by prajesh.ananthan on 21/12/2019.
 *
 * @author Prajesh Ananthan, BIGLIFE Sdn. Bhd.
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.javatechie.*"})
@EntityScan(basePackages = {"com.javatechie.*"})
@EnableJpaRepositories(basePackages = {"com.javatechie.*"})
public class HMSApplication {

    public static void main(String[] args) {
        SpringApplication.run(HMSApplication.class);
    }
}
