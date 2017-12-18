




class OuterClass1 {
    public OuterClass1() {
        inner_class_object = new InnerClass1();
    }
    public OuterClass1(int a)
    {
        //
    }

    InnerClass1 inner_class_object;

    class InnerClass1 {
        public void getName() {
            System.out.println("I am a OuterClass1.InnerClass1");
        }
    }
}
class OuterClass2 extends OuterClass1 {
    public OuterClass2() {
        inner_class_object = new InnerClass2();
    }

    InnerClass2 inner_class_object;

    class InnerClass2 extends OuterClass1.InnerClass1 {
        public void getName() {
            System.out.println("I am a OuterClass2.InnerClass2");
        }
    }
}

class InnerClassTest {
    public static void main(String[] args) {
        OuterClass1 obj = new OuterClass2();
        obj.inner_class_object.getName();
        OuterClass2 obj2 =new OuterClass2();
        obj2.inner_class_object.getName();
    }
}

