         public class Main {
            public static void main(String[] args){
                String[] people = {"Kelly", "Jana"};

                for(int i = 0; i < people.length; i++){
                    System.out.println(people[i]);
                }

                for(String person : people){
                    System.out.println(person);
                }
            }
         }