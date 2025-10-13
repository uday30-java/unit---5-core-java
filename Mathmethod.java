class Mathmethod {
    public static void main(String[] args) {
        System.out.println(Math.max(2,5));
        System.out.println(Math.min(3, 6));

        int a = 10;
        int b = 20;
        System.out.println(a-b);
        System.out.println(Math.abs(a-b));

        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(3, 3));

        System.out.println(Math.round(2.5));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.floor(2.9));

        int randomnumber = (int)(Math.random()*1001);
        System.out.println(randomnumber);

        double angle = Math.toRadians(30);
        System.out.println("sin(30)="+Math.sin(angle));
        System.out.println("cos(30)="+Math.cos(angle));
        System.out.println("tan(30)="+Math.tan(angle));

        double num = 1000;
        System.out.println(Math.log(num));
        System.out.println(Math.log10(num));

        double radius = 5.0;
        double area = Math.PI*Math.pow(radius,2);
        double circumference = 2*Math.PI*radius;
        System.out.println("Area="+ area);
        System.out.println("circumference"+ circumference);

    }
    
}
