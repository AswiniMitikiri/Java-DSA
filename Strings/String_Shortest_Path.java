public class String_Shortest_Path {

    public static float getShortestPath(String path){  //Time Complexity -> O(n)
        int x = 0, y = 0;
        int n = path.length();
        for(int i = 0; i < n; i++){
            char dir = path.charAt(i);

            //South
            if(dir == 'S'){
                y--;
            }
            //North
            else if (dir == 'N') {
                y++;
            }
            //West
            else if (dir == 'W'){
                x--;
            }
            //East
            else {
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2+y2);  
        //type casting is done as Math.sqrt returns a double value 
        //but double can not be converted into float
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
