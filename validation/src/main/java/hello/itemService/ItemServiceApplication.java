package hello.itemService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemServiceApplication.class, args);
    }

/*    @Bean
    public MessageSource messageSource(MessageSource messageSource) {
        ResourceBundleMessageSource mesageSource = new ResourceBundleMessageSource();
        mesageSource.setBasenames("message", "errors");
        mesageSource.setDefaultEncoding("urf-8");
        return messageSource;
    }
    */
}
