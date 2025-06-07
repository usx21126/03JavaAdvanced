package com.xh.d3_collection_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Room {
    private List<Card> allCards = new ArrayList<>();
    {
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♦","♠","♣","♥"};
        int size = 0;
        for(String number : numbers){
            size++;
            for(String color : colors){
                Card c =new Card(color,number,size);
                allCards.add(c);
            }
        }
        Card c1 = new Card("black","🃏",++size);
        Card c2 = new Card("red","🃏",++size);
        Collections.addAll(allCards,c1,c2);
        System.out.println("新牌是:"+allCards);
    }
    //洗牌、发牌、排序、看牌
    public void start() {
        Collections.shuffle(allCards);
        System.out.println("洗牌后:"+allCards);

        ArrayList<Card> lhc = new ArrayList<>();
        ArrayList<Card> ryy = new ArrayList<>();
        ArrayList<Card> dfbb = new ArrayList<>();
        for(int i = 0;i<allCards.size()-3;i++){
            if(i%3==0){
                lhc.add(allCards.get(i));
            }else if(i%3==1){
                ryy.add(allCards.get(i));
            }else if(i%3==2){
                dfbb.add(allCards.get(i));
            }
        }
        System.out.println("lhc:"+lhc);
        System.out.println("ryy:"+ryy);
        System.out.println("dfbb:"+dfbb);

        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size());
        System.out.println("lastThreeCards:"+lastThreeCards);

        ryy.addAll(lastThreeCards);

        Collections.sort(lhc);
        Collections.sort(ryy);
        Collections.sort(dfbb);


        System.out.println("lhc:"+lhc);
        System.out.println("ryy:"+ryy);
        System.out.println("dfbb:"+dfbb);
    }
}
