package calculator.Commands;

import calculator.Main.Context;
import java.util.List;

public interface CalcCommand {
    void execute(Context context, List<String> myArgs) throws CommandExecuteException;
}
