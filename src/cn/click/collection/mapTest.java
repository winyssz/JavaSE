package cn.click.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class mapTest {

    public static void main(String[] args) {
        Map<String,Object> map=new HashMap();
        map.put("Tom",60);
        map.put("Jack",70);
        map.put("小明",90);
        //Set集合存储方式{（key，value），（key，value），（key，value），（key，value）}
        Set<Map.Entry<String, Object>> entrySet = map.entrySet();
        for (Map.Entry<String, Object> stringObjectEntry : entrySet) {
            //此时的stringObjectEntry就是一个一个的（key，value）
            String key=stringObjectEntry.getKey();
            System.out.println(key+":"+stringObjectEntry.getValue());
        }
    }
}
