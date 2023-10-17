class Solution {
    public boolean isValid(String s) {
        //creating HashMap to check valid key
	    	HashMap<Character,Character> map = new HashMap<>();
	    	map.put(')','(');
	    	map.put(']','[');
	    	map.put('}','{');
      
	    	ArrayList<Character> l = new ArrayList<>();
        //if c is opening parenthese put them into the stack.
	    	for(char c:s.toCharArray()) {
	    		if(c=='('|| c=='{'||c=='[') {
	    			l.add(c);
	    		}
          //if c is closing parenthese check that this matches with element on top of the stack
	    		else{
	    			if(l.isEmpty())
	    				return false;
	    			else{
	    				char last=l.remove(l.size()-1);
	    				if(last!=map.get(c)) {
	    					return false;
	    				}
	    			}
	    		}
	    		
	    	}
      //if stack is non empty then opening parenthese has not been closed. 
	    	return l.isEmpty();
    
	    }
	 
