public class Main{
	public static void main(String[] args) {
		tabuada(5);
	}
	public static void tabuada(int n){
	    System.out.printf("Tabuada de %d:\n",n);
	    for(int i=1;i<=10;i++){
	        System.out.println(n+"x"+i+"="+(n*i));
	    }
	}
}
