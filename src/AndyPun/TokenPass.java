package AndyPun;

public class TokenPass {
    private int playerCount;
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount, int currentPlayer, int[] board)
    {
        this.playerCount = playerCount;
        this.currentPlayer = currentPlayer;
        this.board = board;
    }

    public int[] getBoard()
    {
        board = new int (playerCount);
        for (int i = 0,i<board.length, i++)
        {
            
        }
    }

    public void distributeCurrentPlayerTokens()
    {
        int temp = board[currentPlayer], x = 1, n = currentPlayer + 1;
        board[currentPlayer] = 0;
        while(x<=temp)
        {
            if (n<board.length)
            {
                board[n];
            }
        }

    }

    public int getCurrentPlayer()
    {
        currentPlayer = (int)(Math.random()*playerCount);
        return currentPlayer;
    }
}