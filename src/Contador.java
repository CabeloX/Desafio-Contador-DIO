import java.util.Scanner;

public class Contador 
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = scanner.nextInt();


		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = scanner.nextInt();

        try
        {
            contar(parametroUm, parametroDois);
        } 
        catch (ParametrosInvalidosException e) { 
            System.out.print("O SEGUNDO PARAMETRO DEVE SER MAIOR DO QUE O PRIMEIRO PARAMETRO!"); 
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
        else{

        
        int contagem = parametroDois - parametroUm;
		for(int i = 0; i < contagem; i++){
            System.out.println(i);
        }
    }
}
}
