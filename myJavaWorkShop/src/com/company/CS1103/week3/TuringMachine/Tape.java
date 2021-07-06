package week3.TuringMachine;

public class Tape {
    Cell currentCell;

    // Initializes the tap with an empty cell.
    public Tape() {
        this.currentCell = new Cell();
    }

    // Getter method to get the current cell.
    public Cell getCurrentCell(){
        return currentCell;
    }

    // Helper methods to get and set the content at the current cell
    public char getContent(){
        return currentCell.content;
    }

    public void setContent(char ch){
        this.currentCell.content = ch;
    }
    /* public void moveLeft() -- moves the current cell one position to the left along the tape.
     Note that if the current cell is the leftmost cell that exists, then a new cell must be created
     and added to the tape at the left of the current cell, and then the current cell pointer
     can be moved to point to the new cell. The content of the new cell should be a blank space.
     (Remember that the Turing machine's tape is conceptually infinite, so your linked list must
     be prepared to expand on-demand when the machine wants to move past the current end of the list.)
     */
    public void moveLeft(){

        // Create a new cell, if no cell exists to the left.
        if(currentCell.getPrev() == null){
            Cell newCell = new Cell();
            newCell.setNext(currentCell);
            currentCell.setPrev(newCell);
        }

        // Move the tape to the left.
        currentCell = currentCell.getPrev();
    }
    public  void moveRight(){
        // Create a new cell, if no cell exists to the right.
        if(currentCell.getNext() == null) {
            Cell newCell = new Cell();
            newCell.setPrev(currentCell);
            currentCell.setNext(newCell);
        }
        // Move the tape to the right.
        currentCell = currentCell.getNext();

    }
    public String getTapeContents(){
        // Using a temporary cell to traverse the tape and fetch contents.
        Cell tempCell = currentCell;
        // Moving the pointer to the first cell in the tap.
        while(tempCell.getPrev() != null) {
            tempCell = tempCell.getPrev();
        }
        // This stores the contents of the tape.
        String contents = "";
        // This stores a temporary portion of the tap with spaces.
        String pendingSpaces = "";
        // We traverse the tape from left to right.
        while(tempCell != null) {
            // If we find that the current cell is not empty.
            // We first add any temporary sequence of spaces previously observed to the contents.
            // We then add the current cell's content.
            // We also reset the pendingSpaces string to empty.
            if(tempCell.getContent() != ' ') {
                contents += pendingSpaces + tempCell.getContent();
                pendingSpaces = "";
            } else {
            // If the current cell has a blank space,
            // we add that to the pendingSpaces string.
            pendingSpaces += tempCell.getContent();
        }
        tempCell = tempCell.getNext();
    }          // Returns the contents of the tape.
            return contents;
    }

}
