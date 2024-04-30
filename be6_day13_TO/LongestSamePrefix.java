package be6_day13_TO;

//Time Complexity = ???? with n: the length of the input string and m: the length of prefix 

public class LongestSamePrefix {
	public static String findLongestSamePrefix(String[] str){
		if (str == null || str.length == 0) {
            return " ";
        }
        
        String prefix = smallest(str); 									// Initialize the prefix with the first string
        
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); 	// Reduce the prefix by one character
                if (prefix.isEmpty()) {
                    return " ";
                }
            }
        }
        
        return prefix;
	}
	
	public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};

        String result = findLongestSamePrefix(input);
        System.out.println("Longest Same Prefix is: " + result);
        
        String[] input2 = {"dog", "racecar", "car"};
        String result2 = findLongestSamePrefix(input2);
        System.out.println("Longest Same Prefix is: " + result2);
	}
	
	public static String smallest(String[] str) {
        //Keep track of the shortest word by index and length
        int index = 0, minLength = str[0].length();
        for (int i = 1; i < str.length; i++){
            //if the next string is smaller in length then we save that index and length in our variables
            if(str[i].length() < minLength){
                index = i;
                minLength = str[i].length();  
            }           
        }
        //returns the smallest word
        return str[index];
    }
}
