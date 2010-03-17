package pokerGameGUI;

import javax.swing.JFrame;

import pokerGameLogic.IPokerGame;
import pokerGameLogic.IPokerViewer;
import pokerGameTools.PokerGameObserver;

public abstract class GameTableAbstractJFrame extends JFrame implements IPokerViewer
{
    private static final long serialVersionUID = 1L;
    protected PokerGameObserver m_pokerObserver;
    protected IPokerGame m_game;
    protected int m_currentTablePosition;
    
    @Override
    public void setGame(IPokerGame game, int seatViewed)
    {
        m_game = game;
        m_currentTablePosition = seatViewed;
    }
    
    public void start()
    {
        setTitle(getTitle());
        getContentPane().setPreferredSize(getSize());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void setPokerObserver(PokerGameObserver observer)
    {
        m_pokerObserver = observer;
    }
}
