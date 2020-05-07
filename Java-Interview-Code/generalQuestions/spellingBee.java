public static List<Integer> spellingBeeSolutions(List<String> wordlist, List<String> puzzles) {
    // Write your code here

    //String to store the first and subsequent word in the wordlist
    String validWord = "";

    //String to store the first and subsequent word in puzzles
    String puzzleChars = "";

    //List to store the values of the valid strings
    List<Integer> list = new ArrayList<>();

    //int value to store the count of valid words in wordlist to place in the resulting return list
    int validation = 0;

    
    for(int i = 0; i < puzzles.size(); i++){
        //storing the values in the arrays for validation
         puzzleChars = puzzles.get(i);
         
         for(int j = 0; j < wordlist.size(); j++){
         validWord = wordlist.get(j);
        //helper function to keep count of the valid strings ans place them in the return list
            validation += checkValidString(puzzleChars, validWord);
         }
         //adding the value of validation to list at correct position 'i' as it indexes
         list.add( validation);
    }

        //returning the result of the checks
        return list;
    }

    public static int checkValidString(String a, String b){
        //grabbing the first char for the purpose of checking string validity
        char keyChar = a.charAt(0);

        //checking if the english word has the key value in it or else return 0 to signal it does not count as valid
        if(b.indexOf(keyChar)== -1){
                return 0;
            }
        for(int i = 0; i < b.length(); i++){
            if(b.indexOf(a.charAt(i)) != -1){
                continue;
            }
            else{
                return 0;
            }
        }
        return 1;
    }