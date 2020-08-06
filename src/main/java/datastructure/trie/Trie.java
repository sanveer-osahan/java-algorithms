package datastructure.trie;

public class Trie<E> {
	
	protected TrieNode<E> root;
	
    public Trie() {
        this.root = new TrieNode<>();
    }
    
    /** Inserts a word into the trie. */
    public void add(Iterable<E> word) {
    	TrieNode<E> currentNode = this.root;
        for (E currentChar: word) {
        	TrieNode<E> childNode = currentNode.getChild(currentChar);
        	if (childNode == null) {
        		childNode = currentNode.addChild(currentChar);
        	}
        	currentNode = childNode;
        }
        currentNode.setEndOfWord(true);
    }
    
    /** Returns if the word is in the trie. */
    public boolean contains(Iterable<E> word) {
    	TrieNode<E> currentNode = this.root;
        for (E currentChar: word) {
        	TrieNode<E> childNode = currentNode.getChild(currentChar);
        	if (childNode == null)
        		return false;
        	currentNode = childNode;
        }
        return currentNode.isEndOfWord();
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(Iterable<E> prefix) {
    	TrieNode<E> currentNode = this.root;
        for (E currentChar: prefix) {
        	TrieNode<E> childNode = currentNode.getChild(currentChar);
        	if (childNode == null)
        		return false;
        	currentNode = childNode;
        }
        return true;
    }
}
