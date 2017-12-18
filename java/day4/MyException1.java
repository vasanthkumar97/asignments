class MyException1 extends Exception{
    String error;

    MyException1(String error) {
        this.error=error;
    }
    public String toString(){
        return ("Exception Occurred: "+error) ;
    }
}
