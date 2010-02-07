package protocolGame;

import java.util.StringTokenizer;

import protocolTools.IBluffinCommand;
import utility.Constants;

public class GamePlayerMoneyChangedCommand implements IBluffinCommand
{
    private final int m_playerPos;
    private final int m_playerMoney;
    public static String COMMAND_NAME = "gamePLAYER_MONEY_CHANGED";
    
    public GamePlayerMoneyChangedCommand(StringTokenizer argsToken)
    {
        m_playerPos = Integer.parseInt(argsToken.nextToken());
        m_playerMoney = Integer.parseInt(argsToken.nextToken());
    }
    
    public GamePlayerMoneyChangedCommand(int pos, int money)
    {
        m_playerPos = pos;
        m_playerMoney = money;
    }
    
    @Override
    public String encodeCommand()
    {
        final StringBuilder sb = new StringBuilder();
        sb.append(GamePlayerMoneyChangedCommand.COMMAND_NAME);
        sb.append(Constants.DELIMITER);
        sb.append(m_playerPos);
        sb.append(Constants.DELIMITER);
        sb.append(m_playerMoney);
        return sb.toString();
    }
    
    public int getPlayerPos()
    {
        return m_playerPos;
    }
    
    public int getPlayerMoney()
    {
        return m_playerMoney;
    }
}
