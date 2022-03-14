

public class Calc {


    public Calc() {

    }
    public long add(long a, long b){
        return a+b;
    }
    public long sub(long a, long b){
        return a-b;
    }
    public long mult(long a, long b){
        return a*b;
    }
    public long devision(long a, long b){
        /*heloooooooooooooooooo*/

        if(b==0){
            System.out.printf("impossible ! division par 0");
        }
        return a/b;
    }

}
