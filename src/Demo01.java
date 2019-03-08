import java.util.*;

/**
 * @author: Iman
 * date   : 2019/3/6
 */
public class Demo01 {

    public static void main(String[] args) {
        List l =new ArrayList();
        l.add("156");
        l.add("金卡");
        l.add("4646");
        l.add("java");
        l.add("你好");
//		遍历方法1
        for (int i = 0; i < l.size(); i++) {
            String str = (String) l.get(i);
            System.out.println(str);
        }
        System.out.println("---------------");
//		遍历方法2
        ListIterator listIt=l.listIterator();
        while(listIt.hasNext()) {
            String str = (String) listIt.next();
            System.out.println(str);
        }
        while(listIt.hasPrevious()) {
            String str = (String) listIt.previous();
            System.out.println(str);
        }
        System.out.println("---------------");
//		遍历方法3
        Object[] array = l.toArray();
        for (int i = 0; i < array.length; i++) {
            String str = (String) array[i];
            System.out.println(str);
        }
//		遍历方法4
        System.out.println("---------------");
        Iterator it=l.iterator();
        while(it.hasNext()) {
            String str = (String) it.next();
            System.out.println(str);
        }

        System.out.println("---------------");
        Map<String,String> map=new HashMap<>();
        map.put("周瑜", "小乔");
        map.put("吕布", "貂蝉");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("令狐冲", "任盈盈");
        map.put("林平之", "岳灵珊");
//		遍历方法1之获取元素
        String string = map.get("令狐冲");
        System.out.println(string);
        System.out.println("---------------");

//		遍历方法2
        Set<String> keySet = map.keySet();
        for (String string2 : keySet) {
            System.out.println(string2+"=="+map.get(string2));
        }
        System.out.println("-------------------");
        Iterator<String> it1=keySet.iterator();
        while(it.hasNext()) {
            String str=it1.next();
            System.out.println(str+"=="+map.get(str));
        }

//		遍历方法3
        System.out.println("-----------");
        Collection<String> values = map.values();
        for (String string2 : values) {
            System.out.println(string2);
        }

        System.out.println("-------------------");
//		遍历方法4
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry);
        }
        Iterator<Map.Entry<String, String>> it2=entrySet.iterator();
        while(it2.hasNext()) {
            Map.Entry<String, String> str=it2.next();
//            System.out.println(str);
        }
        System.out.println(map.toString());

    }

}
