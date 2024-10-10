public class Main{
	public static void main(String[] args) {
		int vet[] = {1,2,3,4,5};
		System.out.println("Soma:"+soma(vet));
		System.out.println("Multiplicacao:"+multiplicacao(vet));
		mostrar(vet);
	}
	public static int soma(int v[]){
	    int s=0;
	    for(int i=0;i<5;i++)
	        s+=v[i];
	   return s;
	}
	public static int multiplicacao(int v[]){
	    int m=1;
	    for(int i=0;i<5;i++)
	        m*=v[i];
	   return m;
	}
	public static void mostrar(int v[]){
	    System.out.print("Números = ");
	    for(int i=0;i<5;i++)
	        System.out.print(v[i]+" ");
	}
	
	
}
