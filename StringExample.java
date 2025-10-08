class StringExample{
    public static void main(String[] args) {
    // indexOf and lastIndexof
    String check = "java is powerful programming language";
    System.out.println(check.indexOf("java"));
    System.out.println(check.lastIndexOf("language"));
    // replaceFirst and replace
    String a = "Call Cat Cut";
    String b = "Call";
    System.out.println(a.replaceFirst(b, "Ball"));
    System.out.println(a.replace("C","B"));
    //isEmpty,startsWith,endsWith,contains
    String checkMe = "Uday M";
    String check1 = "";
    System.out.println(checkMe.isEmpty());
    System.out.println(check1.isEmpty());
    System.out.println(checkMe.startsWith("U"));
    System.out.println(checkMe.endsWith("M"));
    System.out.println(checkMe.contains("Uday"));
    //concat
    String Firstname = "Ajith";
    String Lastname = "Kumar";
    System.out.println(Firstname+Lastname);
    System.out.println(Firstname.concat(Lastname));
    //compareTo and compareToIgnoreCase
    String Myname = "Ajith";
    String Surname = "Kumar";
    System.out.println(Myname.compareTo(Surname));
    System.out.println(Myname.compareToIgnoreCase(Surname));

    }

}
