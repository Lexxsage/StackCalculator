package test.calculator.commands;

import junit.framework.TestCase;
import calculator.Commands.CalcCommand;
import calculator.Main.Context;
import mathCommands.Summ;

public class SummTest  extends TestCase {

    public void testExecute() throws Exception {
        Double first = 2.0;
        Double second = 1.0;

        Context context = new Context();
        context.pushToStack(first);
        context.pushToStack(second);
        CalcCommand cmd = new Summ();
        cmd.execute(context, null);
        assertEquals(first + second, context.peekAtStack());
    }

}