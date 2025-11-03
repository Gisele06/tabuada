package br.senai.sp.jandira.tabuada;

public class TabuadaMain {
    public static void main(String[] args) {
        System.out.println("Iniciando o programa. . .");
        Tabuada tabuada = new Tabuada();
        tabuada.coletarDados();
        tabuada.calcularTabuada();
        tabuada.exibirTabuada();
    }
}
