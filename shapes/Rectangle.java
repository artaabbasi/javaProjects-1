class Rectangle extends Shape {

    public void printArea(){
        int i, j;
        for (i = 1; i <= x; i++)
        {
            for (j = 1; j <= y; j++)
            {
                if (i == 1 || i == x ||
                    j == 1 || j == y)           
                    System.out.print("*");           
                else
                    System.out.print(" ");           
            }
            System.out.println();
        }

    }
    
    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args){
        Rectangle myObj = new Rectangle(4, 10);
        myObj.printArea();
    }


}
