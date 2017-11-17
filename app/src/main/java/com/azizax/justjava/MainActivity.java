package com.azizax.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import com.azizax.justjava.model.Category;
import com.azizax.justjava.model.Item;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 1; // from the textview
   // Item item; // from the expandedlist
    float price = 0;

  /*  //  SpinnerAdapter listAdapter;
    Spinner spinner_menu;
    HashMap<Category, List<Item>> listData;
    private List<Category> headers;*/

    //  List<OrderedItem> orderedItems;
/*
    public void reset(View view) {
        price=0;
        quantity=0;
        displayPrice(price);
        displayQuantity();
        displayTotalPrice();
    }

    class OrderedItem{
        Item item;
        int quantity;

        public OrderedItem(Item item, int quantity) {
            this.item = item;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return item.toString() + " * " + quantity +"= "+ item.getPrice()*quantity+"\n";
        }
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get the listview
     /*   spinner_menu = (Spinner) findViewById(R.id.spinner_menu);
        prepareListData();

        listAdapter = new SpinnerAdapter(this,R.id.spinner_menu, listData,headers);
        spinner_menu.setAdapter((android.widget.SpinnerAdapter) listAdapter);
        orderedItems = new ArrayList<>();*/

        // Listview on child click listener
  /*      expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                item =listData.get(headers.get(groupPosition)).get(childPosition);
                return false;
            }
        });*/
    }

    /*
      * Preparing the list data
      * next will fetch data from server, cache it
      */
    /*private void prepareListData() {
        listData = new HashMap<>();

        List<Item> localList = new ArrayList<>();
        localList.add(new Item("Tea", (float) 3, Category.hotDrink));
        localList.add(new Item("Coffee", (float) 5, Category.hotDrink));
        localList.add(new Item("Ginger", (float) 4, Category.hotDrink));
        listData.put(Category.hotDrink, localList);
        localList.clear();

        localList.add(new Item("Pepsi", (float) 6, Category.coldDrink));
        localList.add(new Item("Mango", (float) 7, Category.coldDrink));
        localList.add(new Item("iced tea", (float) 3, Category.coldDrink));
        localList.add(new Item("iced coffee", (float) 5, Category.coldDrink));
        listData.put(Category.coldDrink, localList);
        localList.clear();

        localList.add(new Item("Meat sandwich", (float) 20, Category.fastFood));
        localList.add(new Item("Chicken sandwich", (float) 15, Category.fastFood));
        localList.add(new Item("Salade", (float) 8, Category.fastFood));
        listData.put(Category.fastFood, localList);

        headers = new ArrayList<Category>(listData.keySet());
    }*/

    /**
     * This method is called when the order button is clicked.
     */

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity() {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);
    }

    private void displayPrice(float price) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(price));
    }
    private void displayPrice(String orderSummaryMessage) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(orderSummaryMessage);
    }
/*    private void displayTotalPrice() {
        TextView priceTextView = (TextView) findViewById(R.id.total_price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(price));
    }*/

/*    private String createOrderSummary() {
        String summary = "Name: captain Seif/n"; // will be updated to system login cashier
        for (OrderedItem orderedItem:orderedItems)
            summary+=orderedItem.toString();

        // next will add payment method.. etc
        summary+="Thanks!";

        return summary;
    }*/

    private String createOrderSummary(float price) {

        String summary = "Name: captain Seif\n"; // will be updated to system login cashier
        summary += "Quantity: " + quantity + "\n" + "Total: " + price;
        summary += "\nThanks!";
        return summary;
    }

    public void increment(View view) {
        displayPrice(++quantity * 5);
        displayQuantity();
    }

    public void decerment(View view) {
        displayPrice(--quantity * 5);
        displayQuantity();
    }

/*    public void saveOrder(View view) {
        price += quantity * item.getPrice();
        orderedItems.add(new OrderedItem(item, quantity));
        displayTotalPrice();
    }*/

    public void submitOrder(View view) {
        displayPrice(createOrderSummary(quantity*5));
    }
}