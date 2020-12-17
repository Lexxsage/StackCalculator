package test.calculator.commands;

import junit.framework.TestCase;
import calculator.Commands.CalcCommand;
import calculator.Main.Context;
import mathCommands.Div;

public class DivTest extends TestCase {
    public void testExecute() throws Exception {
        Double first = 2.0;
        Double second = 1.0;

        Context context = new Context();
        context.pushToStack(first);
        context.pushToStack(second);

        CalcCommand cmd = new Div();

        cmd.execute(context, null);

        assertEquals(first / second, context.peekAtStack());
    }
}
