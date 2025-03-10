public class Demo8 {
    public static void main(String[] args) {
    //     String str="Doremon";
    //     System.out.println(str);

    //     String name=new String("Pankaj");
    //     System.out.println(name);


    //     name.charAt(1);
    //     System.out.println(name.concat("oberoi"));


    //    System.out.println(name.substring(0, 3)); 

    //    System.out.println(name.length()); 

    //   System.out.println(name.contains("A")); 

    //   System.out.println(name.replaceAll("Pan", "Bin")); 

    //Types of Strings -> mutable and Immutable

    // String name="Ironman";

    // String s1="Natasha";
    // String s2="Natasha";

    // name=name+"Tony";

    // if(s1==s2){
    //     System.out.println("same");
    // }

    // System.out.println(s1.hashCode()); 
    // System.out.println(s2.hashCode()); 


    StringBuffer sb = new StringBuffer("Pankaj");

    System.out.println(sb.capacity()); 
    System.out.println(sb.hashCode());
    
    sb.append(" Oberoi");

    System.out.println(sb);
    System.out.println(sb.hashCode());

    // String name = sb.toString();

    sb.deleteCharAt(2);
    System.out.println(sb);

    sb.insert(0, "Java");
    System.out.println(sb);

    sb.reverse();

    System.out.println(sb);

    }
}
