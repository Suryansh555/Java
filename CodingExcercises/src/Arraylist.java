import java.util.ArrayList;

public class Arraylist {
    private static ArrayList<String> grocerylist = new ArrayList<String>();



    public static void addItem(String grocery){
        grocerylist.add(grocery);
    }

    public static void printItems(){
        if(grocerylist.size() == 0){
            System.out.println("There os nothing in your Grocery List");
        }
        for(int i = 0 ; i < grocerylist.size() ; i ++){
            System.out.println("Item No " + (i+1) + " : " + grocerylist.get(i));
        }

    }

    public static void updateItem(int index , String Item){
        grocerylist.set(index, Item);
        System.out.println("The Grocery List has been updated ");
    }

    public static void deleteItem (int index ){
        System.out.println("The List item " + grocerylist.get(index) + " has been Deleted from the ArrayList");
        grocerylist.remove(index);

    }

    public  static  String findItem(String name){
        int num = grocerylist.indexOf(name);
        if(num >= 0){
            return (grocerylist.get(num));
        }
        return null;
    }

    public static int getIndex(String name){
        return grocerylist.indexOf("name");
    }


}
