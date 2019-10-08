package cn.chendahai.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(DemoService.class)
@EnableConfigurationProperties(DemoServiceProperties.class)
public class DemoStarterEnableAutoConfiguration {

    private DemoServiceProperties demoServiceProperties;

    @Autowired
    public DemoStarterEnableAutoConfiguration(DemoServiceProperties demoServiceProperties) {
        this.demoServiceProperties = demoServiceProperties;
    }

    @Bean
    @ConditionalOnProperty(prefix = "demo.service", name = "enable", havingValue = "true")
    DemoService helloService() {
        return new DemoService(demoServiceProperties.getPrefix(), demoServiceProperties.getSuffix());
    }


}
