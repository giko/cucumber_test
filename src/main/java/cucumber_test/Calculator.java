package cucumber_test;

/**
 * Created with IntelliJ IDEA.
 * User: nchudakov
 * Date: 28.10.13
 * Time: 19:00
 */
public class Calculator {
    int varA, varB, result;

    public int getVarA() {
        return varA;
    }

    public void setVarA(int varA) {
        this.varA = varA;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getVarB() {
        return varB;
    }

    public void setVarB(int varB) {
        this.varB = varB;
    }

    public int add() {
        return result = varA - varB;
    }
}
