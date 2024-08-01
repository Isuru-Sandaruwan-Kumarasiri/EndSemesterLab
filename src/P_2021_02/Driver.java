package P_2021_02;

public class Driver {
    public static void main(String[] args) {

        char[] letters = {'E', 'I', 'S', 'H', 'V', 'U', 'F', 'A', 'R', 'L', 'W', 'P', 'J', 'T', 'N', 'D', 'B', 'X', 'K', 'C', 'Y', 'M', 'G', 'Z', 'Q', 'O'};

        String[] codes = {".", "..", "...", "....", "...-", "..-", "..-.", ".-", ".-.", ".-..", ".--", ".--.", ".---", "-", "-.", "-..", "-...", "-..-", "-.-", "-.-.", "-.--", "--", "--.", "--..", "--.-", "---"};

        Tree MoseDOM=new Tree();

        for(int i=0;i<letters.length;i++){

            CharacterNode data=new CharacterNode(codes[i],letters[i]);
            MoseDOM.insertCharacter(data);


        }

       MoseDOM.inOrderTraversal();

    }
}
