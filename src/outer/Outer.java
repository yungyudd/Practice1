package outer;

public class Outer {
    public void process(){
        int localVar = 0;

        class Local {
            void execute(){
                System.out.println("localVar = "+ localVar);
            }
        }
        Local local = new Local();
        local.execute();

    }
}
