package com.smartbuild;

public class Main {
    public static void main(String[] args) {
        System.out.println("SmartBuild app inicializada");

        // Vulnerabilidad intencional para que SonarQube la detecte
        String password = "123456"; 
        System.out.println("Contraseña interna (NO USAR ASÍ): " + password);

        Calculator calc = new Calculator();
        int r = calc.add(5, 7);
        System.out.println("Resultado suma: " + r);
    }
}
