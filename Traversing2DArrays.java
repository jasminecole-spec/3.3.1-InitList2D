/*
 * Activity 3.3.1
 */
public class Traversing2DArrays
{
  public static void main(String[] args)
  {
   String[][] board = { {"close", "quarter"},
                        {"moon", "rock"},
                        {"band", "stand"},
                        {"out", "shine"} }; 
                       
    /* your code here */
    // for (String[] row : board)
    // {
    //   //System.out.println(row);
    //   for (String col : row)
    //   {
    //     System.out.println(col);
    //   }
    // }

    for (String[] row : board)
    {
      //System.out.println(row);
      for (String col : row)
      {
        // col = "TEST";
        //modifying col does not affect the board array
        System.out.print(col + "\t");
      }
      System.out.println();
    }
  }
}
