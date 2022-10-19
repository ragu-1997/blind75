public class StringFunction {
    public static void main(System.in){
        String name="Hey it's me sunny here " //here  we declare the string
        String name2="hello "
         //now let's talk about all the string function 
         System.out.println(name.charAt[7]); //return the character which is at index 7
         System.out.println(name.length()); // return the length of the string 
         System.out.println(name.substring(4)); // return the substring according to our int value 
         System.out.println(name.substring(4,10)); //return the substring from our given index
         System.out.println(name.contain("sunny")); //check whether that the the string is avaible in our main string 
         System.out.println(name.equal(name2)); // check whether  the value in both the string are equal or not 
         System.out.println(name.isEmpty()); //check whether the string is empty or not 
         System.out.println(name.concat("how are you ?")); // basically concate two strings
         System.out.println(name.replace('h','k')); //rpelace the character or string 
         System.out.println(name.indexOf('s')); // return the index of the given character 
         String cars="ferrari,audi,jaguar,bmw";
         String [] allCars=cars.split(",");

         for(String cars:allCars){
            System.out.println(cars);   //split the string according to our given condtion 
         } 
         System.out.println(name.toLowerCase()); // convert all string into lower case
         System.out.println(name.toUpperCase());//  convert all string into upper  case
         System.out.println(name.trim()); // remove the white spaces from the string 
    } 
    
}
