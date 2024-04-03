package hospital.java;

import hospital.Hospital;

public class main {
    
    public static void main(String[] args) {
        
        Hospital hospital = new Hospital();

        double despesaTotalQuarto = hospital.getQuarto().calcularDespesaTotal();
        double despesaTotalEnfermaria = hospital.getEnfermaria().calcularDespesaTotal();

        System.out.println("Despesa total do quarto: " + despesaTotalQuarto);
        System.out.println("Despesa total da enfermaria: " + despesaTotalEnfermaria);

    }
}
