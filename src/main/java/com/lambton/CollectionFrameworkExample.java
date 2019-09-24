package com.lambton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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

        Set<String> myset=new HashSet<>();
        myset.add("India");
        myset.add("india");
        myset.add("India");
        myset.add("China");
        myset.add("Russia");
        System.out.println(myset);

        
    }
}
