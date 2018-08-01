/*
(Maze Traversal Using Recursive Backtracking) The grid of # s and dots ( . ) in Fig. 18.22 is
a two-dimensional array representation of a maze. The # s represent the walls of the maze, and the
dots represent locations in the possible paths through the maze. A move can be made only to a lo-
cation in the array that contains a dot.
                pg808
Write a recursive method ( mazeTraversal ) to walk through mazes like the one in Fig. 18.22.
The method should receive as arguments a 12-by-12 character array representing the maze and the
current location in the maze (the first time this method is called, the current location should be the
entry point of the maze). As mazeTraversal attempts to locate the exit, it should place the charac-
ter x in each square in the path. There’s a simple algorithm for walking through a maze that guar-
antees finding the exit (assuming there’s an exit). If there’s no exit, you’ll arrive at the starting
location again. The algorithm is as follows: From the current location in the maze, try to move one
space in any of the possible directions (down, right, up or left). If it’s possible to move in at least
one direction, call mazeTraversal recursively, passing the new spot on the maze as the current spot.
If it’s not possible to go in any direction, “back up” to a previous location in the maze and try a new
direction for that location (this is an example of recursive backtracking). Program the method to
display the maze after each move so the user can watch as the maze is solved. The final output of
the maze should display only the path needed to solve the maze—if going in a particular direction
results in a dead end, the x ’s going in that direction should not be displayed. [Hint: To display only
the final path, it may be helpful to mark off spots that result in a dead end with another character
(such as '0' ).]
 */
package chapter18;

/** @author kuna */
public class MazeRecursiveBacktracking {

    public static void main(String[] args) {
        
    }
    
}
