class Circle extends Shape {
    public void printArea(){
    double dist;

    
 
    for (int i = 0; i <= 2 * x; i++) {
 
    for (int j = 0; j <= 2 * x; j++) {
        dist = Math.sqrt((i - x) * (i - x) +
                         (j - x) * (j - x));
 

        if (dist > x - 0.5 && dist < x + 0.5)
        System.out.print("*");
        else
        System.out.print(" ");
    }
 
    System.out.print("\n");
    }

    }
    
    public Circle(int x) {
        this.x = x;
    }

    public static void main(String[] args){
        Circle myObj = new Circle(15);
        myObj.printArea();
    }
}
