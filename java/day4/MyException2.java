class MyException2 extends Exception{
    String error;

    MyException2(String error) {
        this.error=error;
    }
    public String toString(){
        return ("Exception Occurred: "+error) ;
    }
}
