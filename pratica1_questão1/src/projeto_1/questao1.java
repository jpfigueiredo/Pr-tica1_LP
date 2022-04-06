package projeto_1;

import java.util.Scanner;


public class questao1 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);


    int tempo_gasto;
	int velocidade;
	int kmlitro;
	int distancia;
	int media;
	

	
	System.out.println("Digite a velocidade do veículo:");
	velocidade = ler.nextInt(); 
	
	System.out.println("Digite o tempo gasto da viagem:");
	tempo_gasto = ler.nextInt();
	
	System.out.println("Digite a km/l do seu veículo:");
	kmlitro = ler.nextInt();

	
	distancia = velocidade * tempo_gasto;
	
    media = distancia/kmlitro;
	
	System.out.println("Seu veículo consumiu: " + media + "km/l");


	
	
  }
}