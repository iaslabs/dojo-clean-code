package ias.demo.v4.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ias.demo.v4.app")
public class SpringConfig {

    @Bean(name = "storeNorth")
    public Store storeNorth(DefinicionRepositorio repositorio) {
        return new Store("Tienda ABC", "Calle 123", DescontadorDeZone.NORTH, repositorio);
    }

    @Bean(name = "storeSouth")
    public Store storeSouth(DefinicionRepositorio repositorio) {
        return new Store("Tienda XYZ", "Calle 456", DescontadorDeZone.SOUTH, repositorio);
    }
}
