package tree;


import java.util.*;

class TrieNode{
    private char data;
    private Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    boolean isEnd;

    public TrieNode(char ch) {
        this.data = ch;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public TrieNode getChild(char ch) {
        return children.get(ch);
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(Map<Character, TrieNode> children) {
        this.children = children;
    }
}

class TrieClass{

    private TrieNode root;

    public TrieClass() {
        this.root = new TrieNode(' ');
    }

    public void insert(String word){
        TrieNode currentNode = root;

        if (wordExits(word))
            return;

        for (char ch : word.toCharArray()){

            TrieNode node = currentNode.getChild(ch);
            if (node == null){
                TrieNode newNode = new TrieNode(ch);
                currentNode.getChildren().put(ch,newNode);
                currentNode = newNode;
            }else {
                currentNode = node;
            }
        }

        if (currentNode.isEnd != true) currentNode.isEnd = true;
    }


    public boolean wordExits(String word) {

        TrieNode current = root;

        for (char ch : word.toCharArray()){
            if (current == null) return false;
            current = current.getChild(ch);
        }

        return current == null ? false : current.isEnd;
    }

    public List<String> searchbyPrefix(String prefix){
        List<String> autoCompleteList = new ArrayList<String>();

        TrieNode current = root;
        String str= prefix;

        //get sub node for prefix
        for (char ch : prefix.toCharArray()){
            if (current == null) return autoCompleteList;
            current = current.getChild(ch);
        }
        nextNodes(autoCompleteList, current, str);
        return autoCompleteList;
    }

    private List nextNodes(List<String> autoCompleteList, TrieNode current, String str) {
        TrieNode prefixNode = current;
        String prefixStr = str;
        for (char key : current.getChildren().keySet()){
            if (current != prefixNode){
            current = prefixNode;
            str = prefixStr;
            }
            TrieNode currentChild = current.getChild(key);

            str += currentChild.getData();
            if (currentChild.isEnd) autoCompleteList.add(str);

            if (currentChild.getChildren() != null && !currentChild.getChildren().isEmpty()) {
                current = currentChild;
                nextNodes(autoCompleteList, current, str);
            }else {
                current = prefixNode;
                str = prefixStr;
            }
        }

        return autoCompleteList;
    }
}

public class TrieImpl {

    public static void main(String[] args) {
        TrieClass trieClass = new TrieClass();
        System.out.println("test Trie class");


        Scanner sc= new Scanner(System.in);
        char input='Y';

        do{
            System.out.println("\nSelect from below options\n");
            System.out.println("1 for insert ");
            System.out.println("2 for search");
            System.out.println("3 for autocomplete");

            int choice = sc.nextInt();

            switch (choice)
            {
                case 1 :
                    System.out.println("Enter string element to insert");
                    trieClass.insert(sc.next());
                    break;
                case 2 :
                    System.out.println("Enter string to search");
                    System.out.println("word exists : " + trieClass.wordExits(sc.next()));
                    break;
                case 3 :
                    System.out.println("Enter string to autoSuggest");
                    System.out.println("Auto suggestions are : " + trieClass.searchbyPrefix(sc.next()));
                    break;
                default:
                    System.out.println("Invalid selection");

            }

            System.out.println("please hit Y to continue and N to stop");
            input = sc.next().charAt(0);
        }while(input == 'Y');

    }

}
