package homeworkAl.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration // помічаємо що цей клас конфигураційний
public class Config {

    @Bean
    public DrumStation drumStation(){
        return new DrumStation();
    }
    @Bean
    public RapStation rapStation(){
        return new RapStation();
    }

    @Bean
    public RockStation rockStation(){
        return new RockStation();
    }
    @Bean
    public List<Radio> radioList(){
       /* List<Radio>  janre = new ArrayList<>();
        janre.add(drumStation());
        janre.add(rapStation());
        janre.add(rockStation());
        return janre; */
        return Arrays.asList(drumStation(), rockStation(), rapStation());
    }

    @Bean
    public RadioPlayer radioPlayer(){
        return new RadioPlayer(radioList());
    }


}
