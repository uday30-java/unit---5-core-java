public class SbExamples {
    public static void main(String[] args) {
        // append()- used to add text at the end
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        
        sb.append("World");
        System.out.println(sb);
        // insert()- Inserts text at a specific index
        StringBuilder sb1 = new StringBuilder("java");
        sb1.insert(4, "Programming");
        System.out.println(sb1);
        // replace()- Replaces characters between two indexes with new text
        StringBuilder sb2 = new StringBuilder("Hello Java");
        System.out.println(sb2);
        sb2.replace(6,10,"World");
        System.out.println(sb2);
        // delete()- Removes characters between two indexes
        StringBuilder sb3 = new StringBuilder("Credo systemz");
        System.out.println(sb3);
        sb3.delete(4,10 );
        System.out.println(sb3);
    }
    
}
