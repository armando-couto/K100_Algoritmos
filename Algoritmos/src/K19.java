
public class K19 {

	public static void main(String[] args) {
		int[] visualizacoes = new int[] { 1058, 20568, 369, 95585, 5088 };
		 
        int ganhadorAtual = 0;
        
        for (int i = 1; i < visualizacoes.length; i++) {
            if (visualizacoes[ganhadorAtual] < visualizacoes[i]) {
                ganhadorAtual = i;
            }
        }
 
        System.out.println("O �ndice do v�deo mais visto � " + ganhadorAtual);
        
        ganhadorAtual = 0;
        
        for (int i = 1; i < visualizacoes.length; i++) {
            if (visualizacoes[ganhadorAtual] > visualizacoes[i]) {
                ganhadorAtual = i;
            }
        }
 
        System.out.println("O �ndice do v�deo menos visto � " + ganhadorAtual);
	}
}