public class Person201Closest {
    public static void main(String[]argd) throws Exception{
        String file = "data/large.txt";
        double min = Double.MAX_VALUE;
        Person201 a = null;
        Person201 b = null;

        Person201[] people = Person201Utilities.readFile(file);

        for(int i = 0; i < people.length; i++){
            for (int j = people.length - 1; j > i; j--){
                double currentDist = people[j]distanceFrom(people[i]);
                if (currentDist < min){
                    a = people[i];
                    b = people[j];
                    min = currentDist;
                }
            }
        }
    

        System.out.print( "closest distance is %3.2f between %s and %s\n",min,a.getName(),b.getName()); 
    
            
    
    }
}
