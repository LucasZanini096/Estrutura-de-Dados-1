
public class Pill {
    private Object[] data;
    private int counter;

    //Construtor da classe Pilha
    public Pill(){
        this.data = new Object[100];
        this.counter = 0;
    }

    //Método Push()
    public void push(Object x) {
        if(this.counter < this.data.length) {
            this.data[counter++] = x;
        }
    }

      //Método isEmpty()
      public boolean isEmpty() {
        return this.counter == 0;
    }

    //Método Top()
    public Object top(){
        if(this.isEmpty()){
            return null;
        }
        return this.data[this.counter];
    }

    //Método pop()
    public Object pop(Object[] data2){
        if(this.isEmpty()){
            return null;
        }

        //Pegando o primeiro elemento
        Object popItem = data[0];
       
        for(int i = 0; i < this.data.length - 1; i++) {
          this.data[i] = this.data[i + 1];
        }

        this.counter--;

        return popItem;
    }

    //Método count()
    public int count() {
        return this.counter;
    }

    //Método catch()
    public Object catchItem(int x){
        return this.data[x];
    }   

    //Método size()
    public int size() {
        if(this.isEmpty()){
            return 0;
        }
        return this.data.length;
    }

    public boolean haveItem(Object x){

        for(int i = 0; i < this.counter; i++) {
            if(x.equals(this.data[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean isFull() {
        return this.counter == this.data.length;
    }

    public void clear(){
            while (!this.isEmpty()) {
                this.pop(this.data);
            }
        }
    }
