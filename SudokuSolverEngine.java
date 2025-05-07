
public class SudokuSolverEngine {

   public static void main(String[] args) {
      // Here I have called my class `MySudokuBoard` if you named your class
      // differently, modify the line below to use your own class name
      MySudokuBoard board = new MySudokuBoard("boards/fast-solve.sdk");
      System.out.println("Initial board");
      System.out.println(board);
      System.out.println();

      System.out.print("Solving board...");
      long start = System.currentTimeMillis();
      if(board.isSolved()){
         System.out.println("Board is already solved");
      } else if(!board.isValid()) {
         System.out.println("Board cannot be solved");
      } else {
         board.solve();
      }
      long stop = System.currentTimeMillis();
      System.out.printf("SOLVED in %.3f seconds.\n", ((stop-start)/1000.0));
      System.out.println();
      System.out.println(board);
      
   }
}