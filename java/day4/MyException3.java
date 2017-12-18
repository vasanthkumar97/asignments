class MyException3 extends Exception{
    String error;

    MyException3(String error) {
        this.error=error;
    }
    public String toString(){
        return ("Exception Occurred: "+error) ;
    }
}
