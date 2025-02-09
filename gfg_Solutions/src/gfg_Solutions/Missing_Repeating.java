package gfg_Solutions;

import java.util.ArrayList;

public class Missing_Repeating {
	ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> li=new ArrayList<>();
        int xor=0;
      int x=0;
      int y=0;
        int n=arr.length;
        for(int num:arr)
        {
            xor^=num;
        }
        for(int i=1;i<=n;i++)
        {
            xor^=i;
        }
        int setbit=xor & -xor;
        for(int num:arr)
        {
            if((num & setbit)==0)
            {
                x^=num;
            }
            else
            y^=num;
        }
        for(int i=1;i<=n;i++)
        {
            if((i&setbit)==0)
            {
                x^=i;
            }
            else
            y^=i;
        }
        for(int num:arr)
        {
            if(num==x)
            {
        li.add(x);
        li.add(y);
        return li;
            }
        }
      
            li.add(y);
            li.add(x);
      
        return li;
    }
}
