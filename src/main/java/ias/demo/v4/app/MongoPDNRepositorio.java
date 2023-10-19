package ias.demo.v4.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class MongoPDNRepositorio implements DefinicionRepositorio {
    // Atributo todasLasFlores de tipo List<ArregloFloral>
    private List<ArregloFloral> todasLasFlores;

    public MongoPDNRepositorio() {
        this.todasLasFlores = new ArrayList<>();
        this.todasLasFlores.add(new ArregloFloral("Tulipanes", 70000, Sello.PLATA, 100243));
        this.todasLasFlores.add(new ArregloFloral("Girasoles", 370000, Sello.NINGUNO, 1046));
        this.todasLasFlores.add(new ArregloFloral("Rosas", 98000, Sello.BRONCE, 102321));
        this.todasLasFlores.add(new ArregloFloral("Clavel", 240000, Sello.NINGUNO, 10232));
        this.todasLasFlores.add(new ArregloFloral("Camalote", 880000, Sello.ARO, 10342));
    }

    @Override
    public List<ArregloFloral> getTodasLasFlores() {
        return todasLasFlores;
    }
}
