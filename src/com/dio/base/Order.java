package com.dio.base;

public class Order {
    private  final String code;
    private final int totalValue;

    private String[] items;

    public Order(String code, int totalValue){
        this.code = code;
        this.totalValue = totalValue;
    }

    public void printItems(){
        for (String i : items){
            System.out.println(i);
        }

     /*   for (int i = 0; i < items.length; i++){
            System.out.println(items[i]);
        }*/

       /* int i = 0;
        do {
            System.out.println(items[i]);
            i++;
        } while (i < items.length);*/

        /*while(i < items.length){
            System.out.println(items[i]);
            i++;
        }*/
    }

//    public double calculateFee(){
        /*if(totalValue > 100){
            return totalValue + 0.99;
        } else {
            return totalValue
        }*/

       /* switch (totalValue) {
            case 100:
                return totalValue * 0.99;
            case 200:
                return totalValue * 1.99;
            default:
                return totalValue;
        }*/
//    }

  /*  @Override
    public String toString() {
        return "Order{" +
                "code='" + code + '\'' +
                '}';
    }*/
}
