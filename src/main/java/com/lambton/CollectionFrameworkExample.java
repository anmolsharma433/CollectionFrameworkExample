package com.lambton;

import java.util.ArrayList;

public class CollectionFrameworkExample {
    public static void main(String[] args)
    {
        ArrayList<String> mStringArrayList =new ArrayList<>();
        mStringArrayList.add("A");
        mStringArrayList.add("b");
        mStringArrayList.add("c");
        mStringArrayList.add("c");
        mStringArrayList.add("a");
        //System.out.println(mStringArrayList);
        for(int i=0;i <mStringArrayList.size();i++)
        {
            System.out.println(mStringArrayList.get(i));
        }
    }
}
