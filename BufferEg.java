class BufferEg {
    public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Hello");
    System.out.println("Before append:"+ sb);
    sb.append("java");
    System.out.println("After append:"+ sb);
    System.out.println();

    StringBuffer sb1 = new StringBuffer("javascript");
    System.out.println("String:"+ sb1);
    System.out.println("Length:"+sb1.length());
    System.out.println();

    StringBuffer sb2 = new StringBuffer("Computer");
    System.out.println("before:"+sb2);
    sb2.delete(4, 8);
    System.out.println("after:"+sb2);
    System.out.println();

    StringBuffer sb3 = new StringBuffer("Uday");
    System.out.println("String:"+ sb3);
    System.out.println("Capacity():"+ sb3.capacity());
    System.out.println();
    }
    
}
