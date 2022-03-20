class Circle2 extends Shape2 {

    public void show(){
        double dist;
        int x = 10;
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
    

    public static void main(String[] args){
        Circle2 myObj = new Circle2();
        myObj.show();
        myObj.getInfo();
    }
}
