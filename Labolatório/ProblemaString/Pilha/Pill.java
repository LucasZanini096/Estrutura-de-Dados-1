import javax.xml.crypto.Data;

public class Pill {
    private final Data[] data;
    private int counter;

    //Construtor da classe Pilha
    public Pill(){
        this.data = new Data[100];
        this.counter = -1;
    }

    //Método Push()
    public void push(Data x) {
        if(this.counter < this.data.length - 1) {
            this.data[counter++] = x;
        }
    }
    //Método Top()
    public Data top(Data x){
        if(this.isEmpty()){
            return null;
        }
        return this.data[this.counter];
    }

    //Método pop()
    public Data pop(){
        if(this.isEmpty()){
            return null;
        }
       return this.data[this.counter--];
    }

    //Método isEmpty()
    public boolean isEmpty() {
        return this.counter == -1;
    }

    //Método count()
    public int count() {
        return this.counter;
    }

    //Método size()
    public int size() {
        if(this.isEmpty()){
            return 0;
        }
        return this.data.length;
    }

    public boolean isFull() {
        return counter++ == data.length;
    }

    public static void main(String[] args){

        Pill test = new Pill();
        System.out.println(test);

    }
}
