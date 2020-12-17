package calculator.Commands;

import calculator.Main.Context;

import java.util.EmptyStackException;
import java.util.List;

public class Pop implements CalcCommand{
    @Override
    public void execute(Context context, List<String> myArgs) throws CommandExecuteException {
        try{
            context.popFromStack();
        } catch(EmptyStackException e){
            throw new CommandExecuteException("Cannot execute command because stack is empty", e);
        }
    }
}
