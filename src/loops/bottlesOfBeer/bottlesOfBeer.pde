public static void main(String[] args) {
 
  for(int i = 1; i <= 99; i++) {
    
     int beer = 100 - i;
     int beer2 = 99 - i;
     
     if(beer == 1) {
       System.out.println(beer + " bottle of beer on the wall, " + beer + " bottle of beer." + " Take one down and pass it around, no more bottles of beer.");
       System.out.println("Go to the store and but some more, 99 bottles of beer on the wall.");
     } else {
     System.out.println(beer + " bottles of beer on the wall, " + beer + " bottles of beer." + " Take one down and pass it around, " + beer2 + " bottles of beer on the wall.");
     }
  }
  
  
  
}
