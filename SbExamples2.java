class SbExamples2 {
    public static void main(String[] args) {
    //reverse() - Reverses the string
    StringBuilder sb = new StringBuilder("java");
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    //length()
    StringBuilder sb2 = new StringBuilder("Java");
    System.out.println(sb2.length());
    //setCharAt()- Changes a single character at a given index
    StringBuilder sb3 = new StringBuilder("java");
    System.out.println(sb3);
    sb3.setCharAt(0, 'k');
    System.out.println(sb3);
    //charAt()- Retrieves a character at a given position
    StringBuilder sb4 = new StringBuilder("java");
    System.out.println(sb4.charAt(2));
    //substring()- Extracts part of the text
    StringBuilder sb5 = new StringBuilder("Programming");
    System.out.println(sb5.substring(0, 8));
    //tostring()- Converts StringBuilder to a normal String
    StringBuilder sb6 = new StringBuilder("java");
    String str = sb6.toString();
    System.out.println(sb6);
    System.out.println(str);
    }
}

