public class TestThis {
    int value = 70;

    public void test() {
        int value = 20;
        System.out.println(value);
//    this.value = 50;
        System.out.println(this.value);
    }

    public void test2() {

    }

    public static void main(String[] args) {
        TestThis ts = new TestThis();
        ts.test();
        System.out.println(ts.value);
        String s1 = "piyush";
        String s2 = "piyush";
        s2.concat("pandey");
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }

}

