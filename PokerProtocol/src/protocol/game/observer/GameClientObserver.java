package protocol.game.observer;

import java.util.StringTokenizer;

import protocol.Command;
import protocol.game.commands.BetTurnEndedCommand;
import protocol.game.commands.BetTurnStartedCommand;
import protocol.game.commands.GameEndedCommand;
import protocol.game.commands.PlayerHoleCardsChangedCommand;
import protocol.game.commands.PlayerJoinedCommand;
import protocol.game.commands.PlayerLeftCommand;
import protocol.game.commands.PlayerMoneyChangedCommand;
import protocol.game.commands.PlayerTurnBeganCommand;
import protocol.game.commands.PlayerTurnEndedCommand;
import protocol.game.commands.PlayerWonPotCommand;
import protocol.game.commands.GameStartedCommand;
import protocol.game.commands.TableClosedCommand;
import protocol.game.commands.TableInfoCommand;
import protocol.observer.CommandObserver;

public class GameClientObserver extends CommandObserver<IGameClientListener> implements IGameClientListener
{
    
    @Override
    public void betTurnEndedCommandReceived(BetTurnEndedCommand command)
    {
        for (final IGameClientListener listener : getSubscribers())
        {
            listener.betTurnEndedCommandReceived(command);
        }
    }
    
    @Override
    public void betTurnStartedCommandReceived(BetTurnStartedCommand command)
    {
        for (final IGameClientListener listener : getSubscribers())
        {
            listener.betTurnStartedCommandReceived(command);
        }
    }
    
    @Override
    public void gameEndedCommandReceived(GameEndedCommand command)
    {
        for (final IGameClientListener listener : getSubscribers())
        {
            listener.gameEndedCommandReceived(command);
        }
    }
    
    @Override
    public void gameStartedCommandReceived(GameStartedCommand command)
    {
        for (final IGameClientListener listener : getSubscribers())
        {
            listener.gameStartedCommandReceived(command);
        }
    }
    
    @Override
    public void holeCardsChangedCommandReceived(PlayerHoleCardsChangedCommand command)
    {
        for (final IGameClientListener listener : getSubscribers())
        {
            listener.holeCardsChangedCommandReceived(command);
        }
    }
    
    @Override
    public void playerJoinedCommandReceived(PlayerJoinedCommand command)
    {
        for (final IGameClientListener listener : getSubscribers())
        {
            listener.playerJoinedCommandReceived(command);
        }
    }
    
    @Override
    public void playerLeftCommandReceived(PlayerLeftCommand command)
    {
        for (final IGameClientListener listener : getSubscribers())
        {
            listener.playerLeftCommandReceived(command);
        }
    }
    
    @Override
    public void playerMoneyChangedCommandReceived(PlayerMoneyChangedCommand command)
    {
        for (final IGameClientListener listener : getSubscribers())
        {
            listener.playerMoneyChangedCommandReceived(command);
        }
    }
    
    @Override
    public void playerTurnBeganCommandReceived(PlayerTurnBeganCommand command)
    {
        for (final IGameClientListener listener : getSubscribers())
        {
            listener.playerTurnBeganCommandReceived(command);
        }
    }
    
    @Override
    public void playerTurnEndedCommandReceived(PlayerTurnEndedCommand command)
    {
        for (final IGameClientListener listener : getSubscribers())
        {
            listener.playerTurnEndedCommandReceived(command);
        }
    }
    
    @Override
    public void playerWonPotCommandReceived(PlayerWonPotCommand command)
    {
        for (final IGameClientListener listener : getSubscribers())
        {
            listener.playerWonPotCommandReceived(command);
        }
    }
    
    @Override
    public void tableClosedCommandReceived(TableClosedCommand command)
    {
        for (final IGameClientListener listener : getSubscribers())
        {
            listener.tableClosedCommandReceived(command);
        }
    }
    
    @Override
    public void tableInfoCommandReceived(TableInfoCommand command)
    {
        for (final IGameClientListener listener : getSubscribers())
        {
            listener.tableInfoCommandReceived(command);
        }
    }
    
    @Override
    public void commandReceived(String line)
    {
        final StringTokenizer token = new StringTokenizer(line, Command.DELIMITER);
        final String commandName = token.nextToken();
        
        if (commandName.equals(BetTurnEndedCommand.COMMAND_NAME))
        {
            betTurnEndedCommandReceived(new BetTurnEndedCommand(token));
        }
        else if (commandName.equals(BetTurnStartedCommand.COMMAND_NAME))
        {
            betTurnStartedCommandReceived(new BetTurnStartedCommand(token));
        }
        else if (commandName.equals(GameEndedCommand.COMMAND_NAME))
        {
            gameEndedCommandReceived(new GameEndedCommand(token));
        }
        else if (commandName.equals(GameStartedCommand.COMMAND_NAME))
        {
            gameStartedCommandReceived(new GameStartedCommand(token));
        }
        else if (commandName.equals(PlayerHoleCardsChangedCommand.COMMAND_NAME))
        {
            holeCardsChangedCommandReceived(new PlayerHoleCardsChangedCommand(token));
        }
        else if (commandName.equals(PlayerJoinedCommand.COMMAND_NAME))
        {
            playerJoinedCommandReceived(new PlayerJoinedCommand(token));
        }
        else if (commandName.equals(PlayerLeftCommand.COMMAND_NAME))
        {
            playerLeftCommandReceived(new PlayerLeftCommand(token));
        }
        else if (commandName.equals(PlayerMoneyChangedCommand.COMMAND_NAME))
        {
            playerMoneyChangedCommandReceived(new PlayerMoneyChangedCommand(token));
        }
        else if (commandName.equals(PlayerTurnBeganCommand.COMMAND_NAME))
        {
            playerTurnBeganCommandReceived(new PlayerTurnBeganCommand(token));
        }
        else if (commandName.equals(PlayerTurnEndedCommand.COMMAND_NAME))
        {
            playerTurnEndedCommandReceived(new PlayerTurnEndedCommand(token));
        }
        else if (commandName.equals(PlayerWonPotCommand.COMMAND_NAME))
        {
            playerWonPotCommandReceived(new PlayerWonPotCommand(token));
        }
        else if (commandName.equals(TableClosedCommand.COMMAND_NAME))
        {
            tableClosedCommandReceived(new TableClosedCommand(token));
        }
        else if (commandName.equals(TableInfoCommand.COMMAND_NAME))
        {
            tableInfoCommandReceived(new TableInfoCommand(token));
        }
        else
        {
            super.commandReceived(line);
        }
    }
}
