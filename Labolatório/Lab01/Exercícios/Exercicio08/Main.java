//Lucas Zanini da Silva - 32322992
package Exercicio08;

public class Main {

  private int x;
  private int y;

  Main(int posX, int posY){
    this.x = posX;
    this.y = posY;
  }

  static int numPower(int num, int exp){
    if(exp == 0) return 1;

    return num * numPower(num, exp-1);
  }

  static float valueRadius(int pX, int pY){
    return (float)(Math.sqrt(numPower(pX, 2) + numPower(pX, 2)));
  }

  static boolean haColisaoEntreCirculos(int p1X, int p1Y, float r1,
  int p2X, int p2Y, float r2){

    float distCenters = (float)(Math.sqrt(numPower(p1X - p2X, 2) 
    + numPower(p1Y - p2Y, 2)));

    if(distCenters == r1 + r2) return true;
    else return false;

  }

  public static void main(String[] args) {

    Main myPoint = new Main(5, 3);
    Main myPoint2 = new Main(8, 4);
    float radius01 = valueRadius(myPoint.x, myPoint.y);
    float radius02 = valueRadius(myPoint2.x, myPoint2.y);

    boolean answer = haColisaoEntreCirculos(myPoint.x, myPoint.y, radius01,
    myPoint2.x, myPoint2.y, radius02);

    if(answer) System.out.println("True");
    else System.out.println("False");
  }
}
