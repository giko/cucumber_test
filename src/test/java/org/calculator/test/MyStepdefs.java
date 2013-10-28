package org.calculator.test;
import cucumber.api.PendingException;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.То;
import cucumber_test.Calculator;

/**
 * Created with IntelliJ IDEA.
 * User: nchudakov
 * Date: 28.10.13
 * Time: 19:29
 */
public class MyStepdefs {
    Calculator calculator = new Calculator();

    @Допустим("^используются две переменные (\\d+) и (\\d+)$")
    public void используются_две_переменные_var_a_и_var_b(int a, int b) throws Throwable {
        // Express the Regexp above with the code you wish you had
        calculator.setVarA(a);
        calculator.setVarB(b);
    }

    @Когда("^используется оператор сложения$")
    public void используется_оператор_сложения() throws Throwable {
        // Express the Regexp above with the code you wish you had
        calculator.add();
    }

    @То("^результатом является (\\d+)$")
    public void результатом_является_сумма_переменных_а_и_b(int result) throws Throwable {
        // Express the Regexp above with the code you wish you had
        if (calculator.getResult() != result) {
            throw new PendingException();
        }
    }
}
