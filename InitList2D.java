/*
 * Activity 3.3.1
 */
public class InitList2D
{
  public static void main(String[] args)
  {
    String[][] board = { {"close", "quarter"},
                        {"moon", "rock"},
                        {"band", "stand"},
                        {"out", "shine"}  }; 
  for (int i = 0; i < 4; i++)
  {
    for (int j = 0; j < 2; j++)
    {
      System.out.println(board[i][j]);
    }
  }

  for (int j = 0; j < 2; j++)
  {
    for (int i = 0; i < 4; i++)
    {
      System.out.println(board[i][j]);
    }
  }
 }
}
