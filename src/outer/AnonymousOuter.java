package outer;

public class AnonymousOuter {
    private int outInstaneVar = 3;

    public void process(int paramVar){

        int localVar = 1;
        Printer printer = new Printer() {
            int value =0;

            @Override
            public void print() {
                System.out.println("value ="+value);
                System.out.println("localVal="+localVar);
                System.out.println("paramVal="+paramVar);
                System.out.println("outInstanceVal="+outInstaneVar);
            }
        };
        printer.print();
        System.out.println("printer.class="+printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
