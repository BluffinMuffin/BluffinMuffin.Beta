package protocolGame;

import java.util.StringTokenizer;

import protocolTools.IBluffinCommand;

public class GameEndedCommand implements IBluffinCommand
{
    public static String COMMAND_NAME = "gameENDED";
    
    public GameEndedCommand(StringTokenizer argsToken)
    {
    }
    
    public GameEndedCommand()
    {
    }
    
    @Override
    public String encodeCommand()
    {
        final StringBuilder sb = new StringBuilder();
        sb.append(GameEndedCommand.COMMAND_NAME);
        return sb.toString();
    }
}
