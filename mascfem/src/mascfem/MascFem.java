package mascfem;

import java.util.Scanner;

public class MascFem {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);

		String sexo;
		String simnao;
		
		double contM = 0.0d;
		double contMs = 0.0d;
		double contMn = 0.0d;
		
		double contF = 0.0d;
		double contFs = 0.0d;
		double contFn = 0.0d;
		
		double porcentF;
		double porcentM;
		double porcentFs;
		double porcentMs;
		
		for (int i=0;i<15;i++) {
			
			System.out.println("M/F?");
			
			sexo = entrada.nextLine();
			
			if(sexo.equals("M")){
				
				contM++;
				
				System.out.println("S/N?");
				
				simnao = entrada.nextLine();
				
				if(simnao.equals("S")) {
					
					contMs++;
					
				}else if(simnao.equals("N")) {
					
					contMn++;
				}
				
			}else if(sexo.equals("F")) {
				
				contF++;
				
				System.out.println("S/N?");
				
				simnao = entrada.nextLine();
				
				if(simnao.equals("S")) {
					
					contFs++;
					
				}else if(simnao.equals("N")) {
					
					contFn++;
				}
				
			}
			
		}
		
		porcentF = contF/15.0*100.0;
		porcentM = contM/15.0*100.0;
		porcentFs = contFs/contF*100.0;
		porcentMs = contMs/contM*100.0;
		
		
		System.out.println("porcentagem fem "+contF+" "+porcentF+"%");
		System.out.println("porcentagem masc "+contM+" "+porcentM+"%");
		System.out.println("porcentagem fem sim "+contFs+" "+porcentFs+"%");
		System.out.println("porcentagem masc sim "+contMs+" "+porcentMs+"%");



	}

}
