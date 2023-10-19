package ias.demo.v4.app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DinamoQARepositorio implements DefinicionRepositorio {
    // Atributo todasLasFlores de tipo List<ArregloFloral>
    private List<ArregloFloral> todasLasFlores;

    public DinamoQARepositorio() {
        this.todasLasFlores = new ArrayList<>();
        this.todasLasFlores.add(new ArregloFloral("Tulipanes", 240000, Sello.PLATA, 10099));
        this.todasLasFlores.add(new ArregloFloral("Girasoles", 180000, Sello.NINGUNO, 10122));
        this.todasLasFlores.add(new ArregloFloral("Rosas", 190000, Sello.BRONCE, 10099));
        this.todasLasFlores.add(new ArregloFloral("Clavel", 199000, Sello.NINGUNO, 1000));
        this.todasLasFlores.add(new ArregloFloral("Camalote", 289000, Sello.ARO, 14430));
    }

    @Override
    public List<ArregloFloral> getTodasLasFlores() {
        return todasLasFlores;
    }
}
