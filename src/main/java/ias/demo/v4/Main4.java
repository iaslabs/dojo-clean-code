package ias.demo.v4;

import ias.demo.v4.app.Franquisia;
import ias.demo.v4.app.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Franquisia franquisia = context.getBean(Franquisia.class);
        franquisia.simularCompra();
        context.close();
    }
}