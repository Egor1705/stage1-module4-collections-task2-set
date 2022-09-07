package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for(Integer i:sourceList){
            set.add(i);
            if(i%2!=0){

                set.add(2*i);
            }
            else{
                while(i%2==0){
                    i=i/2;
                    set.add(i);
                }
            }
        }
return set;
    }
}
