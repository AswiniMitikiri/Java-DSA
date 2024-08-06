public class LinearSearch {
    public static int linearSearch(String menu[], String key1) {
        for(int i = 0; i < menu.length; i++){
            if(menu[i] == key1){
                return i;
            }
        }
        return -1;
    }

    public static void main (String args[]){
        //int numbers[] = {2,4,6,8,10,12,14,16};
        String menu[] = {"dosa", "vada", "samosa"};
        //int key = 10;
        String key1 = "samosa";
        int index = linearSearch(menu,key1);

        if(index == -1){
            System.out.println("NOT FOUND");
        } else {
            System.out.println("Key is found at " + index);
        }
    }
    
}
