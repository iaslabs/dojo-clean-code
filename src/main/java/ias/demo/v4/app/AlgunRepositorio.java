package ias.demo.v4.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AlgunRepositorio implements DefinicionRepositorio {
    // Atributo todasLasFlores de tipo List<ArregloFloral>
    private List<ArregloFloral> todasLasFlores;

    public AlgunRepositorio() {
        this.todasLasFlores = new ArrayList<>();
        this.todasLasFlores.add(new ArregloFloral("Tulipanes", 180000, Sello.PLATA, 100));
        this.todasLasFlores.add(new ArregloFloral("Girasoles", 110000, Sello.NINGUNO, 10));
        this.todasLasFlores.add(new ArregloFloral("Rosas", 90000, Sello.BRONCE, 10));
        this.todasLasFlores.add(new ArregloFloral("Clavel", 170000, Sello.NINGUNO, 10));
        this.todasLasFlores.add(new ArregloFloral("Camalote", 280000, Sello.ARO, 10));
    }

    @Override
    public List<ArregloFloral> getTodasLasFlores() {
        return todasLasFlores;
    }
}
