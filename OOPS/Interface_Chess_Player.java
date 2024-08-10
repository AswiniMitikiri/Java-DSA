public class Interface_Chess_Player {
    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();  
    //by default public, abstract but can not implement.
}

class Queen implements ChessPlayer{
    public void moves(){       
        //we need to mention this method as public,
        // otherwise it will take default type 
        //but our moves() method is public in above ChessPlayer interface
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){       
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){       
        System.out.println("up, down, left, right, diagonal (by one step)");
    }
}