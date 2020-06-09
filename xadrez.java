import java.util.Scanner;

public class xadrez {

	public static void main(String[] args) {
		
		int repeticao = 0;
		int x, y;
		Scanner leitor = new Scanner (System.in);
		
		do {
		System.out.println("Movimentação de uma torre no xadrez");
		System.out.println("Digite o número da linha : ");
		x = leitor.nextInt();
		System.out.println("Digite o número da coluna : ");
		y = leitor.nextInt();
		
		if (x==1 && y==1) {
			System.out.println("    1   2   3   4   5   6   7   8    ");
			System.out.println("   |-----------------------------");
			System.out.println("  1|x   x   x   x   x   x   x   x");
			System.out.println("  2|x   -   -   -   -   -   -   -");
			System.out.println("  3|x   -   -   -   -   -   -   -");
			System.out.println("  4|x   -   -   -   -   -   -   -");
			System.out.println("  5|x   -   -   -   -   -   -   -");
			System.out.println("  6|x   -   -   -   -   -   -   -");
			System.out.println("  7|x   -   -   -   -   -   -   -");
			System.out.println("  8|x   -   -   -   -   -   -   -");}
			
			else if (x== 1 && y==2) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|x   x   x   x   x   x   x   x");
				System.out.println("  2|-   x   -   -   -   -   -   -");
				System.out.println("  3|-   x   -   -   -   -   -   -");
				System.out.println("  4|-   x   -   -   -   -   -   -");
				System.out.println("  5|-   x   -   -   -   -   -   -");
				System.out.println("  6|-   x   -   -   -   -   -   -");
				System.out.println("  7|-   x   -   -   -   -   -   -");
				System.out.println("  8|-   x   -   -   -   -   -   -");}
		
			else if (x==1 && y==3) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|x   x   x   x   x   x   x   x");
				System.out.println("  2|-   -   x   -   -   -   -   -");
				System.out.println("  3|-   -   x   -   -   -   -   -");
				System.out.println("  4|-   -   x   -   -   -   -   -");
				System.out.println("  5|-   -   x   -   -   -   -   -");
				System.out.println("  6|-   -   x   -   -   -   -   -");
				System.out.println("  7|-   -   x   -   -   -   -   -");
				System.out.println("  8|-   -   x   -   -   -   -   -");}
		
			else if (x==1 && y==4) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|x   x   x   x   x   x   x   x");
				System.out.println("  2|-   -   -   x   -   -   -   -");
				System.out.println("  3|-   -   -   x   -   -   -   -");
				System.out.println("  4|-   -   -   x   -   -   -   -");
				System.out.println("  5|-   -   -   x   -   -   -   -");
				System.out.println("  6|-   -   -   x   -   -   -   -");
				System.out.println("  7|-   -   -   x   -   -   -   -");
				System.out.println("  8|-   -   -   x   -   -   -   -");}
			
			else if (x==1 && y==5) {
					System.out.println("    1   2   3   4   5   6   7   8    ");
					System.out.println("   |-----------------------------");
					System.out.println("  1|x   x   x   x   x   x   x   x");
					System.out.println("  2|-   -   -   -   x   -   -   -");
					System.out.println("  3|-   -   -   -   x   -   -   -");
					System.out.println("  4|-   -   -   -   x   -   -   -");
					System.out.println("  5|-   -   -   -   x   -   -   -");
					System.out.println("  6|-   -   -   -   x   -   -   -");
					System.out.println("  7|-   -   -   -   x   -   -   -");
					System.out.println("  8|-   -   -   -   x   -   -   -");}
		
			else if (x==1 && y==6) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|x   x   x   x   x   x   x   x");
				System.out.println("  2|-   -   -   -   -   x   -   -");
				System.out.println("  3|-   -   -   -   -   x   -   -");
				System.out.println("  4|-   -   -   -   -   x   -   -");
				System.out.println("  5|-   -   -   -   -   x   -   -");
				System.out.println("  6|-   -   -   -   -   x   -   -");
				System.out.println("  7|-   -   -   -   -   x   -   -");
				System.out.println("  8|-   -   -   -   -   x   -   -");}
		
			else if (x==1 && y==7) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|x   x   x   x   x   x   x   x");
				System.out.println("  2|-   -   -   -   -   -   x   -");
				System.out.println("  3|-   -   -   -   -   -   x   -");
				System.out.println("  4|-   -   -   -   -   -   x   -");
				System.out.println("  5|-   -   -   -   -   -   x   -");
				System.out.println("  6|-   -   -   -   -   -   x   -");
				System.out.println("  7|-   -   -   -   -   -   x   -");
				System.out.println("  8|-   -   -   -   -   -   x   -");}
		
			else if (x==1 && y==8) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|x   x   x   x   x   x   x   x");
				System.out.println("  2|-   -   -   -   -   -   -   x");
				System.out.println("  3|-   -   -   -   -   -   -   x");
				System.out.println("  4|-   -   -   -   -   -   -   x");
				System.out.println("  5|-   -   -   -   -   -   -   x");
				System.out.println("  6|-   -   -   -   -   -   -   x");
				System.out.println("  7|-   -   -   -   -   -   -   x");
				System.out.println("  8|-   -   -   -   -   -   -   x");}
		
			else if (x==2 && y==1) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|x   -   -   -   -   -   -   -");
				System.out.println("  2|x   x   x   x   x   x   x   x");
				System.out.println("  3|x   -   -   -   -   -   -   -");
				System.out.println("  4|x   -   -   -   -   -   -   -");
				System.out.println("  5|x   -   -   -   -   -   -   -");
				System.out.println("  6|x   -   -   -   -   -   -   -");
				System.out.println("  7|x   -   -   -   -   -   -   -");
				System.out.println("  8|x   -   -   -   -   -   -   -");}
		
			else if (x==2 && y==2) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   x   -   -   -   -   -   -");
				System.out.println("  2|x   x   x   x   x   x   x   x");
				System.out.println("  3|-   x   -   -   -   -   -   -");
				System.out.println("  4|-   x   -   -   -   -   -   -");
				System.out.println("  5|-   x   -   -   -   -   -   -");
				System.out.println("  6|-   x   -   -   -   -   -   -");
				System.out.println("  7|-   x   -   -   -   -   -   -");
				System.out.println("  8|-   x   -   -   -   -   -   -");}
		
			else if (x==2 && y==3) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   x   -   -   -   -   -");
				System.out.println("  2|x   x   x   x   x   x   x   x");
				System.out.println("  3|-   -   x   -   -   -   -   -");
				System.out.println("  4|-   -   x   -   -   -   -   -");
				System.out.println("  5|-   -   x   -   -   -   -   -");
				System.out.println("  6|-   -   x   -   -   -   -   -");
				System.out.println("  7|-   -   x   -   -   -   -   -");
				System.out.println("  8|-   -   x   -   -   -   -   -");}
		
			else if (x==2 && y==4) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   x   -   -   -   -");
				System.out.println("  2|x   x   x   x   x   x   x   x");
				System.out.println("  3|-   -   -   x   -   -   -   -");
				System.out.println("  4|-   -   -   x   -   -   -   -");
				System.out.println("  5|-   -   -   x   -   -   -   -");
				System.out.println("  6|-   -   -   x   -   -   -   -");
				System.out.println("  7|-   -   -   x   -   -   -   -");
				System.out.println("  8|-   -   -   x   -   -   -   -");}
		
			else if (x==2 && y==5) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   x   -   -   -");
				System.out.println("  2|x   x   x   x   x   x   x   x");
				System.out.println("  3|-   -   -   -   x   -   -   -");
				System.out.println("  4|-   -   -   -   x   -   -   -");
				System.out.println("  5|-   -   -   -   x   -   -   -");
				System.out.println("  6|-   -   -   -   x   -   -   -");
				System.out.println("  7|-   -   -   -   x   -   -   -");
				System.out.println("  8|-   -   -   -   x   -   -   -");}
		
			else if (x==2 && y==6) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   x   -   -");
				System.out.println("  2|x   x   x   x   x   x   x   x");
				System.out.println("  3|-   -   -   -   -   x   -   -");
				System.out.println("  4|-   -   -   -   -   x   -   -");
				System.out.println("  5|-   -   -   -   -   x   -   -");
				System.out.println("  6|-   -   -   -   -   x   -   -");
				System.out.println("  7|-   -   -   -   -   x   -   -");
				System.out.println("  8|-   -   -   -   -   x   -   -");}
		
			else if (x==2 && y==7) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   -   x   -");
				System.out.println("  2|x   x   x   x   x   x   x   x");
				System.out.println("  3|-   -   -   -   -   -   x   -");
				System.out.println("  4|-   -   -   -   -   -   x   -");
				System.out.println("  5|-   -   -   -   -   -   x   -");
				System.out.println("  6|-   -   -   -   -   -   x   -");
				System.out.println("  7|-   -   -   -   -   -   x   -");
				System.out.println("  8|-   -   -   -   -   -   x   -");}
		
			else if (x==2 && y==8) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   -   -   x");
				System.out.println("  2|x   x   x   x   x   x   x   x");
				System.out.println("  3|-   -   -   -   -   -   -   x");
				System.out.println("  4|-   -   -   -   -   -   -   x");
				System.out.println("  5|-   -   -   -   -   -   -   x");
				System.out.println("  6|-   -   -   -   -   -   -   x");
				System.out.println("  7|-   -   -   -   -   -   -   x");
				System.out.println("  8|-   -   -   -   -   -   -   x");}
		
			else if (x==3 && y==1) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|x   -   -   -   -   -   -   -");
				System.out.println("  2|x   -   -   -   -   -   -   -");
				System.out.println("  3|x   x   x   x   x   x   x   x");
				System.out.println("  4|x   -   -   -   -   -   -   -");
				System.out.println("  5|x   -   -   -   -   -   -   -");
				System.out.println("  6|x   -   -   -   -   -   -   -");
				System.out.println("  7|x   -   -   -   -   -   -   -");
				System.out.println("  8|x   -   -   -   -   -   -   -");}
		
			else if (x==3 && y==2) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   x   -   -   -   -   -   -");
				System.out.println("  2|-   x   -   -   -   -   -   -");
				System.out.println("  3|x   x   x   x   x   x   x   x");
				System.out.println("  4|-   x   -   -   -   -   -   -");
				System.out.println("  5|-   x   -   -   -   -   -   -");
				System.out.println("  6|-   x   -   -   -   -   -   -");
				System.out.println("  7|-   x   -   -   -   -   -   -");
				System.out.println("  8|-   x   -   -   -   -   -   -");}
		
			else if (x==3 && y==3) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   x   -   -   -   -   -");
				System.out.println("  2|-   -   x   -   -   -   -   -");
				System.out.println("  3|x   x   x   x   x   x   x   x");
				System.out.println("  4|-   -   x   -   -   -   -   -");
				System.out.println("  5|-   -   x   -   -   -   -   -");
				System.out.println("  6|-   -   x   -   -   -   -   -");
				System.out.println("  7|-   -   x   -   -   -   -   -");
				System.out.println("  8|-   -   x   -   -   -   -   -");}
		
			else if (x==3 && y==4) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   x   -   -   -   -");
				System.out.println("  2|-   -   -   x   -   -   -   -");
				System.out.println("  3|x   x   x   x   x   x   x   x");
				System.out.println("  4|-   -   -   x   -   -   -   -");
				System.out.println("  5|-   -   -   x   -   -   -   -");
				System.out.println("  6|-   -   -   x   -   -   -   -");
				System.out.println("  7|-   -   -   x   -   -   -   -");
				System.out.println("  8|-   -   -   x   -   -   -   -");}
		
			else if (x==3 && y==5) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   x   -   -   -");
				System.out.println("  2|-   -   -   -   x   -   -   -");
				System.out.println("  3|x   x   x   x   x   x   x   x");
				System.out.println("  4|-   -   -   -   x   -   -   -");
				System.out.println("  5|-   -   -   -   x   -   -   -");
				System.out.println("  6|-   -   -   -   x   -   -   -");
				System.out.println("  7|-   -   -   -   x   -   -   -");
				System.out.println("  8|-   -   -   -   x   -   -   -");}
		
			else if (x==3 && y==6) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   x   -   -");
				System.out.println("  2|-   -   -   -   -   x   -   -");
				System.out.println("  3|x   x   x   x   x   x   x   x");
				System.out.println("  4|-   -   -   -   -   x   -   -");
				System.out.println("  5|-   -   -   -   -   x   -   -");
				System.out.println("  6|-   -   -   -   -   x   -   -");
				System.out.println("  7|-   -   -   -   -   x   -   -");
				System.out.println("  8|-   -   -   -   -   x   -   -");}
		
			else if (x==3 && y==7) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   -   x   -");
				System.out.println("  2|-   -   -   -   -   -   x   -");
				System.out.println("  3|x   x   x   x   x   x   x   x");
				System.out.println("  4|-   -   -   -   -   -   x   -");
				System.out.println("  5|-   -   -   -   -   -   x   -");
				System.out.println("  6|-   -   -   -   -   -   x   -");
				System.out.println("  7|-   -   -   -   -   -   x   -");
				System.out.println("  8|-   -   -   -   -   -   x   -");}
		
			else if (x==3 && y==8) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   -   -   x");
				System.out.println("  2|-   -   -   -   -   -   -   x");
				System.out.println("  3|x   x   x   x   x   x   x   x");
				System.out.println("  4|-   -   -   -   -   -   -   x");
				System.out.println("  5|-   -   -   -   -   -   -   x");
				System.out.println("  6|-   -   -   -   -   -   -   x");
				System.out.println("  7|-   -   -   -   -   -   -   x");
				System.out.println("  8|-   -   -   -   -   -   -   x");}
		
			else if (x==4 && y==1) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|x   -   -   -   -   -   -   -");
				System.out.println("  2|x   -   -   -   -   -   -   -");
				System.out.println("  3|x   -   -   -   -   -   -   -");
				System.out.println("  4|x   x   x   x   x   x   x   x");
				System.out.println("  5|x   -   -   -   -   -   -   -");
				System.out.println("  6|x   -   -   -   -   -   -   -");
				System.out.println("  7|x   -   -   -   -   -   -   -");
				System.out.println("  8|x   -   -   -   -   -   -   -");}
		
			else if (x==4 && y==2) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   x   -   -   -   -   -   -");
				System.out.println("  2|-   x   -   -   -   -   -   -");
				System.out.println("  3|-   x   -   -   -   -   -   -");
				System.out.println("  4|x   x   x   x   x   x   x   x");
				System.out.println("  5|-   x   -   -   -   -   -   -");
				System.out.println("  6|-   x   -   -   -   -   -   -");
				System.out.println("  7|-   x   -   -   -   -   -   -");
				System.out.println("  8|-   x   -   -   -   -   -   -");}
		
			else if (x==4 && y==3) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   x   -   -   -   -   -");
				System.out.println("  2|-   -   x   -   -   -   -   -");
				System.out.println("  3|-   -   x   -   -   -   -   -");
				System.out.println("  4|x   x   x   x   x   x   x   x");
				System.out.println("  5|-   -   x   -   -   -   -   -");
				System.out.println("  6|-   -   x   -   -   -   -   -");
				System.out.println("  7|-   -   x   -   -   -   -   -");
				System.out.println("  8|-   -   x   -   -   -   -   -");}
		
			else if (x==4 && y==4) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   x   -   -   -   -");
				System.out.println("  2|-   -   -   x   -   -   -   -");
				System.out.println("  3|-   -   -   x   -   -   -   -");
				System.out.println("  4|x   x   x   x   x   x   x   x");
				System.out.println("  5|-   -   -   x   -   -   -   -");
				System.out.println("  6|-   -   -   x   -   -   -   -");
				System.out.println("  7|-   -   -   x   -   -   -   -");
				System.out.println("  8|-   -   -   x   -   -   -   -");}
		
			else if (x==4 && y==5) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   x   -   -   -");
				System.out.println("  2|-   -   -   -   x   -   -   -");
				System.out.println("  3|-   -   -   -   x   -   -   -");
				System.out.println("  4|x   x   x   x   x   x   x   x");
				System.out.println("  5|-   -   -   -   x   -   -   -");
				System.out.println("  6|-   -   -   -   x   -   -   -");
				System.out.println("  7|-   -   -   -   x   -   -   -");
				System.out.println("  8|-   -   -   -   x   -   -   -");}
		
			else if (x==4 && y==6) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   x   -   -");
				System.out.println("  2|-   -   -   -   -   x   -   -");
				System.out.println("  3|-   -   -   -   -   x   -   -");
				System.out.println("  4|x   x   x   x   x   x   x   x");
				System.out.println("  5|-   -   -   -   -   x   -   -");
				System.out.println("  6|-   -   -   -   -   x   -   -");
				System.out.println("  7|-   -   -   -   -   x   -   -");
				System.out.println("  8|-   -   -   -   -   x   -   -");}
		
			else if (x==4 && y==7) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   -   x   -");
				System.out.println("  2|-   -   -   -   -   -   x   -");
				System.out.println("  3|-   -   -   -   -   -   x   -");
				System.out.println("  4|x   x   x   x   x   x   x   x");
				System.out.println("  5|-   -   -   -   -   -   x   -");
				System.out.println("  6|-   -   -   -   -   -   x   -");
				System.out.println("  7|-   -   -   -   -   -   x   -");
				System.out.println("  8|-   -   -   -   -   -   x   -");}
		
			else if (x==4 && y==8) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   -   -   x");
				System.out.println("  2|-   -   -   -   -   -   -   x");
				System.out.println("  3|-   -   -   -   -   -   -   x");
				System.out.println("  4|x   x   x   x   x   x   x   x");
				System.out.println("  5|-   -   -   -   -   -   -   x");
				System.out.println("  6|-   -   -   -   -   -   -   x");
				System.out.println("  7|-   -   -   -   -   -   -   x");
				System.out.println("  8|-   -   -   -   -   -   -   x");}
		
			else if (x==5 && y==1) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|x   -   -   -   -   -   -   -");
				System.out.println("  2|x   -   -   -   -   -   -   -");
				System.out.println("  3|x   -   -   -   -   -   -   -");
				System.out.println("  4|x   -   -   -   -   -   -   -");
				System.out.println("  5|x   x   x   x   x   x   x   x");
				System.out.println("  6|x   -   -   -   -   -   -   -");
				System.out.println("  7|x   -   -   -   -   -   -   -");
				System.out.println("  8|x   -   -   -   -   -   -   -");}
		
			else if (x==5 && y==2) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   x   -   -   -   -   -   -");
				System.out.println("  2|-   x   -   -   -   -   -   -");
				System.out.println("  3|-   x   -   -   -   -   -   -");
				System.out.println("  4|-   x   -   -   -   -   -   -");
				System.out.println("  5|x   x   x   x   x   x   x   x");
				System.out.println("  6|-   x   -   -   -   -   -   -");
				System.out.println("  7|-   x   -   -   -   -   -   -");
				System.out.println("  8|-   x   -   -   -   -   -   -");}
		
			else if (x==5 && y==3) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   x   -   -   -   -   -");
				System.out.println("  2|-   -   x   -   -   -   -   -");
				System.out.println("  3|-   -   x   -   -   -   -   -");
				System.out.println("  4|-   -   x   -   -   -   -   -");
				System.out.println("  5|x   x   x   x   x   x   x   x");
				System.out.println("  6|-   -   x   -   -   -   -   -");
				System.out.println("  7|-   -   x   -   -   -   -   -");
				System.out.println("  8|-   -   x   -   -   -   -   -");}
		
			else if (x==5 && y==4) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   x   -   -   -   -");
				System.out.println("  2|-   -   -   x   -   -   -   -");
				System.out.println("  3|-   -   -   x   -   -   -   -");
				System.out.println("  4|-   -   -   x   -   -   -   -");
				System.out.println("  5|x   x   x   x   x   x   x   x");
				System.out.println("  6|-   -   -   x   -   -   -   -");
				System.out.println("  7|-   -   -   x   -   -   -   -");
				System.out.println("  8|-   -   -   x   -   -   -   -");}
		
			else if (x==5 && y==5) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   x   -   -   -");
				System.out.println("  2|-   -   -   -   x   -   -   -");
				System.out.println("  3|-   -   -   -   x   -   -   -");
				System.out.println("  4|-   -   -   -   x   -   -   -");
				System.out.println("  5|x   x   x   x   x   x   x   x");
				System.out.println("  6|-   -   -   -   x   -   -   -");
				System.out.println("  7|-   -   -   -   x   -   -   -");
				System.out.println("  8|-   -   -   -   x   -   -   -");}
		
			else if (x==5 && y==6) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   x   -   -");
				System.out.println("  2|-   -   -   -   -   x   -   -");
				System.out.println("  3|-   -   -   -   -   x   -   -");
				System.out.println("  4|-   -   -   -   -   x   -   -");
				System.out.println("  5|x   x   x   x   x   x   x   x");
				System.out.println("  6|-   -   -   -   -   x   -   -");
				System.out.println("  7|-   -   -   -   -   x   -   -");
				System.out.println("  8|-   -   -   -   -   x   -   -");}
		
			else if (x==5 && y==7) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   -   x   -");
				System.out.println("  2|-   -   -   -   -   -   x   -");
				System.out.println("  3|-   -   -   -   -   -   x   -");
				System.out.println("  4|-   -   -   -   -   -   x   -");
				System.out.println("  5|x   x   x   x   x   x   x   x");
				System.out.println("  6|-   -   -   -   -   -   x   -");
				System.out.println("  7|-   -   -   -   -   -   x   -");
				System.out.println("  8|-   -   -   -   -   -   x   -");}
		
			else if (x==5 && y==8) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   -   -   x");
				System.out.println("  2|-   -   -   -   -   -   -   x");
				System.out.println("  3|-   -   -   -   -   -   -   x");
				System.out.println("  4|-   -   -   -   -   -   -   x");
				System.out.println("  5|x   x   x   x   x   x   x   x");
				System.out.println("  6|-   -   -   -   -   -   -   x");
				System.out.println("  7|-   -   -   -   -   -   -   x");
				System.out.println("  8|-   -   -   -   -   -   -   x");}
		
			else if (x==6 && y==1) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|x   -   -   -   -   -   -   -");
				System.out.println("  2|x   -   -   -   -   -   -   -");
				System.out.println("  3|x   -   -   -   -   -   -   -");
				System.out.println("  4|x   -   -   -   -   -   -   -");
				System.out.println("  5|x   -   -   -   -   -   -   -");
				System.out.println("  6|x   x   x   x   x   x   x   x");
				System.out.println("  7|x   -   -   -   -   -   -   -");
				System.out.println("  8|x   -   -   -   -   -   -   -");}
		
			else if (x==6 && y==2) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   x   -   -   -   -   -   -");
				System.out.println("  2|-   x   -   -   -   -   -   -");
				System.out.println("  3|-   x   -   -   -   -   -   -");
				System.out.println("  4|-   x   -   -   -   -   -   -");
				System.out.println("  5|-   x   -   -   -   -   -   -");
				System.out.println("  6|x   x   x   x   x   x   x   x");
				System.out.println("  7|-   x   -   -   -   -   -   -");
				System.out.println("  8|-   x   -   -   -   -   -   -");}
		
			else if (x==6 && y==3) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   x   -   -   -   -   -");
				System.out.println("  2|-   -   x   -   -   -   -   -");
				System.out.println("  3|-   -   x   -   -   -   -   -");
				System.out.println("  4|-   -   x   -   -   -   -   -");
				System.out.println("  5|-   -   x   -   -   -   -   -");
				System.out.println("  6|x   x   x   x   x   x   x   x");
				System.out.println("  7|-   -   x   -   -   -   -   -");
				System.out.println("  8|-   -   x   -   -   -   -   -");}
		
			else if (x==6 && y==4) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   x   -   -   -   -");
				System.out.println("  2|-   -   -   x   -   -   -   -");
				System.out.println("  3|-   -   -   x   -   -   -   -");
				System.out.println("  4|-   -   -   x   -   -   -   -");
				System.out.println("  5|-   -   -   x   -   -   -   -");
				System.out.println("  6|x   x   x   x   x   x   x   x");
				System.out.println("  7|-   -   -   x   -   -   -   -");
				System.out.println("  8|-   -   -   x   -   -   -   -");}
		
			else if (x==6 && y==5) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   x   -   -   -");
				System.out.println("  2|-   -   -   -   x   -   -   -");
				System.out.println("  3|-   -   -   -   x   -   -   -");
				System.out.println("  4|-   -   -   -   x   -   -   -");
				System.out.println("  5|-   -   -   -   x   -   -   -");
				System.out.println("  6|x   x   x   x   x   x   x   x");
				System.out.println("  7|-   -   -   -   x   -   -   -");
				System.out.println("  8|-   -   -   -   x   -   -   -");}
		
			else if (x==6 && y==6) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   x   -   -");
				System.out.println("  2|-   -   -   -   -   x   -   -");
				System.out.println("  3|-   -   -   -   -   x   -   -");
				System.out.println("  4|-   -   -   -   -   x   -   -");
				System.out.println("  5|-   -   -   -   -   x   -   -");
				System.out.println("  6|x   x   x   x   x   x   x   x");
				System.out.println("  7|-   -   -   -   -   x   -   -");
				System.out.println("  8|-   -   -   -   -   x   -   -");}
		
			else if (x==6 && y==7) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   -   x   -");
				System.out.println("  2|-   -   -   -   -   -   x   -");
				System.out.println("  3|-   -   -   -   -   -   x   -");
				System.out.println("  4|-   -   -   -   -   -   x   -");
				System.out.println("  5|-   -   -   -   -   -   x   -");
				System.out.println("  6|x   x   x   x   x   x   x   x");
				System.out.println("  7|-   -   -   -   -   -   x   -");
				System.out.println("  8|-   -   -   -   -   -   x   -");}
		
			else if (x==6 && y==8) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   -   -   x");
				System.out.println("  2|-   -   -   -   -   -   -   x");
				System.out.println("  3|-   -   -   -   -   -   -   x");
				System.out.println("  4|-   -   -   -   -   -   -   x");
				System.out.println("  5|-   -   -   -   -   -   -   x");
				System.out.println("  6|x   x   x   x   x   x   x   x");
				System.out.println("  7|-   -   -   -   -   -   -   x");
				System.out.println("  8|-   -   -   -   -   -   -   x");}
		
			else if (x==7 && y==1) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|x   -   -   -   -   -   -   -");
				System.out.println("  2|x   -   -   -   -   -   -   -");
				System.out.println("  3|x   -   -   -   -   -   -   -");
				System.out.println("  4|x   -   -   -   -   -   -   -");
				System.out.println("  5|x   -   -   -   -   -   -   -");
				System.out.println("  6|x   -   -   -   -   -   -   -");
				System.out.println("  7|x   x   x   x   x   x   x   x");
				System.out.println("  8|x   -   -   -   -   -   -   -");}
		
			else if (x==7 && y==2) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   x   -   -   -   -   -   -");
				System.out.println("  2|-   x   -   -   -   -   -   -");
				System.out.println("  3|-   x   -   -   -   -   -   -");
				System.out.println("  4|-   x   -   -   -   -   -   -");
				System.out.println("  5|-   x   -   -   -   -   -   -");
				System.out.println("  6|-   x   -   -   -   -   -   -");
				System.out.println("  7|x   x   x   x   x   x   x   x");
				System.out.println("  8|-   x   -   -   -   -   -   -");}
		
			else if (x==7 && y==3) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   x   -   -   -   -   -");
				System.out.println("  2|-   -   x   -   -   -   -   -");
				System.out.println("  3|-   -   x   -   -   -   -   -");
				System.out.println("  4|-   -   x   -   -   -   -   -");
				System.out.println("  5|-   -   x   -   -   -   -   -");
				System.out.println("  6|-   -   x   -   -   -   -   -");
				System.out.println("  7|x   x   x   x   x   x   x   x");
				System.out.println("  8|-   -   x   -   -   -   -   -");}
		
			else if (x==7 && y==4) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   x   -   -   -   -");
				System.out.println("  2|-   -   -   x   -   -   -   -");
				System.out.println("  3|-   -   -   x   -   -   -   -");
				System.out.println("  4|-   -   -   x   -   -   -   -");
				System.out.println("  5|-   -   -   x   -   -   -   -");
				System.out.println("  6|-   -   -   x   -   -   -   -");
				System.out.println("  7|x   x   x   x   x   x   x   x");
				System.out.println("  8|-   -   -   x   -   -   -   -");}
		
			else if (x==7 && y==5) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   x   -   -   -");
				System.out.println("  2|-   -   -   -   x   -   -   -");
				System.out.println("  3|-   -   -   -   x   -   -   -");
				System.out.println("  4|-   -   -   -   x   -   -   -");
				System.out.println("  5|-   -   -   -   x   -   -   -");
				System.out.println("  6|-   -   -   -   x   -   -   -");
				System.out.println("  7|x   x   x   x   x   x   x   x");
				System.out.println("  8|-   -   -   -   x   -   -   -");}
		
			else if (x==7 && y==6) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   x   -   -");
				System.out.println("  2|-   -   -   -   -   x   -   -");
				System.out.println("  3|-   -   -   -   -   x   -   -");
				System.out.println("  4|-   -   -   -   -   x   -   -");
				System.out.println("  5|-   -   -   -   -   x   -   -");
				System.out.println("  6|-   -   -   -   -   x   -   -");
				System.out.println("  7|x   x   x   x   x   x   x   x");
				System.out.println("  8|-   -   -   -   -   x   -   -");}
		
			else if (x==7 && y==7) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   -   x   -");
				System.out.println("  2|-   -   -   -   -   -   x   -");
				System.out.println("  3|-   -   -   -   -   -   x   -");
				System.out.println("  4|-   -   -   -   -   -   x   -");
				System.out.println("  5|-   -   -   -   -   -   x   -");
				System.out.println("  6|-   -   -   -   -   -   x   -");
				System.out.println("  7|x   x   x   x   x   x   x   x");
				System.out.println("  8|-   -   -   -   -   -   x   -");}
		
			else if (x==7 && y==8) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   -   -   x");
				System.out.println("  2|-   -   -   -   -   -   -   x");
				System.out.println("  3|-   -   -   -   -   -   -   x");
				System.out.println("  4|-   -   -   -   -   -   -   x");
				System.out.println("  5|-   -   -   -   -   -   -   x");
				System.out.println("  6|-   -   -   -   -   -   -   x");
				System.out.println("  7|x   x   x   x   x   x   x   x");
				System.out.println("  8|-   -   -   -   -   -   -   x");}
		
			else if (x==8 && y==1) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|x   -   -   -   -   -   -   -");
				System.out.println("  2|x   -   -   -   -   -   -   -");
				System.out.println("  3|x   -   -   -   -   -   -   -");
				System.out.println("  4|x   -   -   -   -   -   -   -");
				System.out.println("  5|x   -   -   -   -   -   -   -");
				System.out.println("  6|x   -   -   -   -   -   -   -");
				System.out.println("  7|x   -   -   -   -   -   -   -");
				System.out.println("  8|x   x   x   x   x   x   x   x");}
		
			else if (x==8 && y==2) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   x   -   -   -   -   -   -");
				System.out.println("  2|-   x   -   -   -   -   -   -");
				System.out.println("  3|-   x   -   -   -   -   -   -");
				System.out.println("  4|-   x   -   -   -   -   -   -");
				System.out.println("  5|-   x   -   -   -   -   -   -");
				System.out.println("  6|-   x   -   -   -   -   -   -");
				System.out.println("  7|-   x   -   -   -   -   -   -");
				System.out.println("  8|x   x   x   x   x   x   x   x");}
		
			else if (x==8 && y==3) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   x   -   -   -   -   -");
				System.out.println("  2|-   -   x   -   -   -   -   -");
				System.out.println("  3|-   -   x   -   -   -   -   -");
				System.out.println("  4|-   -   x   -   -   -   -   -");
				System.out.println("  5|-   -   x   -   -   -   -   -");
				System.out.println("  6|-   -   x   -   -   -   -   -");
				System.out.println("  7|-   -   x   -   -   -   -   -");
				System.out.println("  8|x   x   x   x   x   x   x   x");}
		
			else if (x==8 && y==4) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   x   -   -   -   -");
				System.out.println("  2|-   -   -   x   -   -   -   -");
				System.out.println("  3|-   -   -   x   -   -   -   -");
				System.out.println("  4|-   -   -   x   -   -   -   -");
				System.out.println("  5|-   -   -   x   -   -   -   -");
				System.out.println("  6|-   -   -   x   -   -   -   -");
				System.out.println("  7|-   -   -   x   -   -   -   -");
				System.out.println("  8|x   x   x   x   x   x   x   x");}
		
		
			else if (x==8 && y==5) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   x   -   -   -");
				System.out.println("  2|-   -   -   -   x   -   -   -");
				System.out.println("  3|-   -   -   -   x   -   -   -");
				System.out.println("  4|-   -   -   -   x   -   -   -");
				System.out.println("  5|-   -   -   -   x   -   -   -");
				System.out.println("  6|-   -   -   -   x   -   -   -");
				System.out.println("  7|-   -   -   -   x   -   -   -");
				System.out.println("  8|x   x   x   x   x   x   x   x");}
		
			else if (x==8 && y==6) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   x   -   -");
				System.out.println("  2|-   -   -   -   -   x   -   -");
				System.out.println("  3|-   -   -   -   -   x   -   -");
				System.out.println("  4|-   -   -   -   -   x   -   -");
				System.out.println("  5|-   -   -   -   -   x   -   -");
				System.out.println("  6|-   -   -   -   -   x   -   -");
				System.out.println("  7|-   -   -   -   -   x   -   -");
				System.out.println("  8|x   x   x   x   x   x   x   x");}
		
		
			else if (x==8 && y==7) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   -   x   -");
				System.out.println("  2|-   -   -   -   -   -   x   -");
				System.out.println("  3|-   -   -   -   -   -   x   -");
				System.out.println("  4|-   -   -   -   -   -   x   -");
				System.out.println("  5|-   -   -   -   -   -   x   -");
				System.out.println("  6|-   -   -   -   -   -   x   -");
				System.out.println("  7|-   -   -   -   -   -   x   -");
				System.out.println("  8|x   x   x   x   x   x   x   x");}
		
			else if (x==8 && y==8) {
				System.out.println("    1   2   3   4   5   6   7   8    ");
				System.out.println("   |-----------------------------");
				System.out.println("  1|-   -   -   -   -   -   -   x");
				System.out.println("  2|-   -   -   -   -   -   -   x");
				System.out.println("  3|-   -   -   -   -   -   -   x");
				System.out.println("  4|-   -   -   -   -   -   -   x");
				System.out.println("  5|-   -   -   -   -   -   -   x");
				System.out.println("  6|-   -   -   -   -   -   -   x");
				System.out.println("  7|-   -   -   -   -   -   -   x");
				System.out.println("  8|x   x   x   x   x   x   x   x");}
		
			else
				System.out.println("Os números digitados não se encontram tente novamente");
		
	
			}while(repeticao <= 4);
		}
	}


