abstract class Shape2 {
    public abstract void show();
    public void getInfo(){
        String info = this.getClass().getSimpleName();
        System.out.println("*-*-*-*-*-*-*---*-**-*-*-*-*-*-**-");
        System.out.println(info);
    }
}
