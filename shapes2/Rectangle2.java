class Rectangle2 extends Shape2 {

    public void show(){
        int i, j, x=5, y=5;
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

    public static void main(String[] args){
        Rectangle2 myObj = new Rectangle2();
        myObj.show();
        myObj.getInfo();

    }
}
