package ttttaskfour;

import java.util.*;

public class Students {
    public String name;
    public Integer grade;

//method to run add,remove  & display student method#
    public void main() {
        Method m = new Method();
        m.addStudent("fathima", 2);
        m.removeStudent("madan", 11);
        m.displayName("arjun");


    }

    class Method {

//Method to add student
        //i/p:name1,grade1
        //i/p:name2,grade2
        //o/p:{name1=grade1,name2=grade2}
        public void addStudent(String name, Integer grade) {
            Map<String, Integer> map = new HashMap<>();
            map.put("aravind", 1);
            map.put("malini", 5);
            map.put("arjun", 8);
            map.put("madan", 11);
            map.put("kajal", 1);
            map.put("kasthuri", 5);

            map.put(name, grade);
            map.entrySet();
            System.out.println(map);

        }

        //Method to remove student
        //i/p:remove(name1,grade1)
        //o/p:map={name2=grade2}

        public void removeStudent(String name, Integer grade) {

            Map<String, Integer> map = new HashMap<>();
            map.put("aravind", 1);
            map.put("malini", 5);
            map.put("arjun", 8);
            map.put("madan", 11);
            map.put("kajal", 1);
            map.put("kasthuri", 5);

            map.put(name, grade);
            map.remove(name, grade);
            System.out.println(map.entrySet());
        }
//Method to display map
        public void displayName(String name) {
            Map<String, Integer> map = new HashMap<>();
            map.put("aravind", 1);
            map.put("malini", 5);
            map.put("arjun", 8);
            map.put("madan", 11);
            map.put("kajal", 1);
            map.put("kasthuri", 5);

            System.out.println(map.get(name));
        }

    }



}


