package test.calculator.commands;

import junit.framework.TestCase;
import calculator.Commands.CalcCommand;
import calculator.Main.Context;
import mathCommands.Sqrt;

public class SqrtTest extends TestCase{
    public void testExecute() throws Exception {
        Double first = 10.0;

        Context context = new Context();
        context.pushToStack(first);

        CalcCommand cmd = new Sqrt();

        cmd.execute(context, null);

        assertEquals(Math.sqrt(first), context.peekAtStack());
    }
}
