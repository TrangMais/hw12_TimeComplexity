package be6_day13_TO;

//Time Complexity = O(n)with n: the length of the input string

public class RomanToInteger {
	public static int getInt(char c) {
		switch (c) {
			case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:return -1;
        }
    }
	
	public static int romanToInt(String str) {
		int result=0;
        if(str != null && !str.equals("")){
        	int i = 0;
        	while(i <= str.length()-1) {
        		if(i==(str.length()-1)){
        			return result + getInt(str.charAt(i));
        			}
        		int currentPosition = getInt(str.charAt(i));
        		int nextPosition = getInt(str.charAt(i+1));
        		if(currentPosition < nextPosition) {
        			result = result - currentPosition;
        		}else {
        			result = result + currentPosition;
        		}
        		i++;
                }
            }
            return result;
        }

	public static void main(String[] args) {
		String str = "XIV";

		int result = romanToInt(str);
		System.out.println(result);
	}
}
