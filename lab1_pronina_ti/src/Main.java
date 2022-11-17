import resource.AbstractItem;
import patterns.TechItem;
import patterns.DomesticItem;
import patterns.FoodItem;

import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main( String[] args )
    {

        List<AbstractItem> ItemList = new ArrayList<>();

        //scan items and send to distribute
        ItemList.add(new TechItem("Heating water boiler", 49, 46, 130, 120));
        ItemList.add(new TechItem("Smartphone", 14.3f, 7, 0.71f, 0.17f));
        ItemList.add(new TechItem("Giant Robot To Enslaving Territories ",200 ,200 , 1000, 1000));
        ItemList.add(new DomesticItem("Not Domestos", 7.8f,4, 29, 1));
        ItemList.add(new FoodItem("Leg Of Lamb", 50, 20,30, 12));
        ItemList.add(new FoodItem("Potato", 100, 100,50, 1190));
        ItemList.add(new FoodItem("Onion", 70, 100,50, 833.3f));

        for (AbstractItem item : ItemList){

            System.out.println("\n----------------------------------------");
            System.out.println(item.GetName());
            System.out.println(item.GetGabarite());
            System.out.println(item.GetItemType());
            System.out.println(item.GetStoragePlace());
            System.out.println(item.GetTypeOfPlace());
            System.out.println("----------------------------------------");

        }


    }
}