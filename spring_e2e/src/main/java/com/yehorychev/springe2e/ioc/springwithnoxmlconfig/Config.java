package com.yehorychev.springe2e.ioc.springwithnoxmlconfig;

import com.yehorychev.springe2e.ioc.Cat;
import com.yehorychev.springe2e.ioc.Person;
import com.yehorychev.springe2e.ioc.Pet;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
//@ComponentScan("com/yehorychev/springe2e/iocexamples")
public class Config {

    @Bean
    @Scope("singleton") // -> default scope for all beans, it's not mandatory to add @Scope("singleton") annotation
    public Pet catBean() { // the name of this method it's a bean ID -> bean ID = catBean
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
