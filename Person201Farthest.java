public class Person201Farthest {
    public static void main(String[] args) throws Exception {
        String file = "data/large.txt";
        double max = 0;
        Person201 a = null;
        Person201 b = null;

        Person201[] people = Person201Utilities.readFile(file);

        for (int i = 0; i<people.length; i++) {
            Person201 p1 = people[i];
            for (int k = i+1; k<people.length; k++) {
                Person201 p2 = people[k];
                double d = p1.distanceFrom(p2);
                if (d > max) {
                    max = d;
                    a = p1;
                    b = p2;
                }


            }

        }
        


        System.out.printf("farthest distance is %3.2f between %s and %s\n",max,a.getName(),b.getName());
        
    }



}