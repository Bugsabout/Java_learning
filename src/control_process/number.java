package control_process;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
 
        for (a = -100; a <= 100; a++) {
            for (b = -100; b <= 100; b++) {
                for (c = -100; c <= 100; c++) {
                    for (d = -100; d <= 100; d++) {
                            if(a+b==8&&c-d==6&&a+c==14&&b+d==10){
                                 
                                System.out.println("a:"+a);
                                System.out.println("b:"+b);
                                System.out.println("c:"+c);
                                System.out.println("d:"+d);
                                 
                            }
                    }
                }
            }
        }
	}

}
