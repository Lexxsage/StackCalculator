package test.calculator.commands;

import junit.framework.TestCase;
import calculator.Commands.CalcCommand;
import mathCommands.Diff;
import calculator.Main.Context;

public class DiffTest extends TestCase{
    public void testExecute() throws Exception{
        Double first = 10.0;
        Double second = 20.0;

        Context context = new Context();
        context.pushToStack(first);
        context.pushToStack(second);

        CalcCommand cmd = new Diff();

        cmd.execute(context, null);

        assertEquals(first - second, context.peekAtStack());
    }
}
