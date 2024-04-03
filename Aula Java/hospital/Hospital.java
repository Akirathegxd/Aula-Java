package hospital;

import recintos.Enfermaria;
import recintos.Quarto;

public class Hospital {
    private Quarto quarto;
    private Enfermaria enfermaria;

    public Enfermaria getEnfermaria() {
        this.enfermaria = new Enfermaria();

        return this.enfermaria;        
    }

    public Quarto getQuarto() {
        this.quarto = new Quarto();
        
        return this.quarto;
    }

}