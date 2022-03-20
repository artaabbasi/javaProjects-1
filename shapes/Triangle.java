class Triangle extends Shape {
    public void printArea(){
        for (int i=0; i<x; i++)
        {
 
            for (int j=x-i; j>1; j--)
            {
                System.out.print(" ");
            }
  

            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
  
            System.out.println();
        }

    }
    
    public Triangle(int x) {
        this.x = x;
    }

    public static void main(String[] args){
        Triangle myObj = new Triangle(4);
        myObj.printArea();
    }
}
