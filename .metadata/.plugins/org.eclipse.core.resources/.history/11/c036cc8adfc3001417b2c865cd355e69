import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Math;

public class Evaluator  {  
    /* Most of the operators will have left association, However Sin,Cos,Tan,Arcsin,ArcCos,ArcTan will have Right association
     */
    private static final int LEFT_ASSOC  = 0;  
    private static final int RIGHT_ASSOC = 1;
    Scanner sc = new Scanner(System.in);
   
    // Operators  
    private static final Map<String, int[]> OPERATORS = new HashMap<String, int[]>();  
    static{  
        // Map<"token", []{precendence, associativity}>  
        OPERATORS.put("+", new int[] { 0, LEFT_ASSOC });  
        OPERATORS.put("-", new int[] { 0, LEFT_ASSOC });  
        OPERATORS.put("*", new int[] { 5, LEFT_ASSOC });  
        OPERATORS.put("/", new int[] { 5, LEFT_ASSOC }); //these are in reverese order of precedence with highest precedendce the last one listed          
        OPERATORS.put("^", new int[] {10, LEFT_ASSOC });
        OPERATORS.put("Sin", new int [] {25, LEFT_ASSOC }); /// Not working, we may have to use a different method of handling sin cos and tan- 
        /* I think we should handle it BEFORE it goes into RPN. So if for example the input reads 5 ( Sin ( 90 ) ) this should be handled
         * by a seperate method which would take in the String AS WELL AS a BOOLEAN regarding rads or degrees and convert it. So if this
         * was in degrees it would return 5 ( 1 ) as the string which would then be passed in the the infixtoRPN. 
         * 
         */
    }  
   
    // Check if token is an operator  listed in the Map called OPEARTORS
    private static boolean isOperator(String token){  
        return OPERATORS.containsKey(token);  
    }  
   
    // Test associativity of operator token  
    private static boolean isAssociative(String token, int type){  
        if (!isOperator(token)){  
            throw new IllegalArgumentException("Invalid token: " + token);  
        }  
          
        if (OPERATORS.get(token)[1] == type) {  
            return true;  
        }  
        return false;  
    }  
   
    // Compare precedence of operators.      
    private static final int cmpPrecedence(String token1, String token2){  
        if (!isOperator(token1) || !isOperator(token2)){  
            throw new IllegalArgumentException("Invalid tokens: " + token1  
                    + " " + token2);  
        }  
        return OPERATORS.get(token1)[0] - OPERATORS.get(token2)[0];  
    }  
   
    // Convert infix expression format into reverse Polish notation  
    public static String[] infixToRPN(String[] inputTokens){  
        /* 
         * Stack is a java object which implements a LIFO stack .
         * We are (being original!!) calling our Stack, stack . . .
         * EXPLANATION OF stack methods: 
         * .push --> places the element onto the top of the stack
         * .pop  --> take the top element off the list
         * .peak --> LOOKS AT but does not remove the top element
         */
    	ArrayList<String> postFix = new ArrayList<String>();  
        Stack<String> stack = new Stack<String>();  
          
        // For each token  
        for (String token : inputTokens){  
            // If token is an operator i.e. it has to be in the map OPERATORS 
            if (isOperator(token)){    
                // While stack not empty AND stack top element   
                // If the stack is NOT empty 
                while (!stack.empty() && isOperator(stack.peek())){                      
                    if ((isAssociative(token, LEFT_ASSOC)         &&   
                         cmpPrecedence(token, stack.peek()) <= 0) ||   
                        (isAssociative(token, RIGHT_ASSOC)        &&   
                         cmpPrecedence(token, stack.peek()) < 0)){  
                        postFix.add(stack.pop());     
                        continue;  
                    }  
                    break;  
                }  
                // Push the new operator on the stack  
                stack.push(token);  
            }   
            //OTHERWISE IT WILLCheck if it is parentheses etc.
            // If token is a left bracket '('  
            else if (token.equals("(")){  
                stack.push(token);  //   
            }   
            // If token is a right bracket ')'  
            else if (token.equals(")")){                  
                while (!stack.empty() && !stack.peek().equals("(")){  
                    postFix.add(stack.pop());   
                }  
                stack.pop();   
            }   
            // If token is a number  
            else{  
                postFix.add(token);   
            }  
        }  
        while (!stack.empty()){  
            postFix.add(stack.pop());   
        }  
        String[] output = new String[postFix.size()];  
        return postFix.toArray(output);  
        /*
         * The above code follows the normal algorithn for calclatin reverse polish notation. It is quite simple and I don't think
         * any other group has used this Stack object 
         */
    }  
      
    public static double postfixToSolution(String[] tokens){          
        Stack<String> stack = new Stack<String>();  
          
        // For each token   
        for (String token : tokens){  
            // If the token is a value push it onto the stack  
            if (!isOperator(token)){  
                stack.push(token);                  
            }else{
                // Token is a regular operator: pop top two entries  
                Double d2 = Double.valueOf( stack.pop() );  
                Double d1 = Double.valueOf( stack.pop() );  
                  	
                //Get the result  
                Double result = token.compareTo("+") == 0 ? d1 + d2 :   
                				token.compareTo("-") == 0 ? d1 - d2 :  
                                token.compareTo("*") == 0 ? d1 * d2 :  
                                token.compareTo("/") == 0 ? d1 / d2 :
                                	Math.pow(d1, d2) ;               
                                  
                // Push result onto stack  
                stack.push( String.valueOf( result ));  
            }                          
        }          
        return Double.valueOf(stack.pop());  
    }
    
    public static String getTrigValues(String input){
    	String stringWithTrigValsCalculated="";
    	Pattern sinPattern = Pattern.compile("Sin");
    	Pattern cosPattern = Pattern.compile("Cos");
    	Matcher matcher = sinPattern.matcher(input);  	
    	if (matcher.matches()){
    	//then there is a Sin value so we take the number to the right of it and find the 
    		//Sin of that
    		
    	}
    	return stringWithTrigValsCalculated;
     }
   
    public static void main(String[] args) {  
    	System.out.println("Enter String");
        Scanner temp = new Scanner(System.in);
    	String[] input = (temp.nextLine()).split(" ");
     	//String[] input = "( 1 + -2 ) * ( 3 / 4 ) - ( 5 + 6 )".split(" ");         
    	String[] output = infixToRPN(input);  
          
        // Build output RPN string minus the commas  
         for (String token : output) {  
            System.out.print(token + " ");  
        }  
          
        // Feed the RPN string to postfixToSolution to give result  
        Double result = postfixToSolution( output );
        System.out.println("\n result== " + result);
    }  
}  