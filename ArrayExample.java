class ArrayExample {
    public static void main(String[] args) {
        int marks[] = {10,20,30,40,50};
        System.out.println(marks[0]);
        System.out.println(marks[2]);

        String topics[] = {"html","css","bootstrap","react","java","springboot"};
        System.out.println(topics.length);
        System.out.println(topics[1]);
        topics[0] = "xml&html";
        System.out.println(topics[0]);

        String topic[] = {"html","css","bootstrap","react","redux","java","springboot"};
        for(int i=0;i<topic.length;i++){
            System.out.println(i + "-"+ topic[i]);
        }

        int mark[] = {50,60,70,80,90};
        int sum = 0;
        float avg;
        int length = mark.length;
        System.out.println("length-"+ length);
        for(int i=0;i<mark.length;i++){
            sum+=mark[i];
            System.out.println("sum-"+ sum);
        } 
            avg = sum/length;
            System.out.println("avg-"+avg);
        }
     }


