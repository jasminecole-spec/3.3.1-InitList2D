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
  System.out.println(board[0]);
  for (int i = 0; i < 4; i++)

  {

    System.out.println(board[i]); // show object references

  }
 }
}
