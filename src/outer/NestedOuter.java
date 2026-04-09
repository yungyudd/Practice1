package outer;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested{
        private int nestedInstanceValue = 1;

        public void print() {
            // static은 static끼리 통한다.
            //자신의 멤버에 접근
            //바깥 클래스의 인스턴스 멤버에 접근 x
            System.out.println(nestedInstanceValue);
            System.out.println(NestedOuter.outClassValue);
        }
    }
}
