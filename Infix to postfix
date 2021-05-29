import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner inp = new Scanner(System.in);
					  String g = inp.next();
					  Stack<String> s = new Stack<>();
					  int l = g.length();
					  for (int i=0;i<l;i++){
						  String c = Character.toString(g.charAt(i));
						  if (c.equals("(")){
							  s.push(c);
						  }else if (c.equals(")")){
							  while (!s.peek().equals("(")){
								System.out.print(s.peek());
								s.pop();
						  	  }
							  s.pop();
						  }else if (value(c)>=1){
							  if (s.empty() || s.peek().equals("(") || value(c)>value(s.peek())){
							  	s.push(c);
							  }else if (c.equals(s.peek())){
								  System.out.print(s.peek());
							  }else{
								  while (!s.empty() && !s.equals("(") && value(s.peek())>value(c)){
									System.out.print(s.peek());
									s.pop();
								  }
								  s.push(c);
							  }
						  }else{
							  System.out.print(c);
						  }
					  }
					  while (!s.empty()){
						  if (!s.peek().equals("(")){
						  	System.out.print(s.peek());
						  }
						  s.pop();
					  }
	}
	public static int value(String s){
		if (s.equals("^")){
			return 5;
		}else if (s.equals("/")){
			return 4;
		}else if (s.equals("*")){
			return 3;
		}else if (s.equals("+")){
			return 2;
		}else if (s.equals("-")){
			return 1;
		}else{
			return 0;
		}
	}
}
