package datastructure.trie;

import java.util.Map;

public class WordDictionary{
	
	private TrieNode<Character> root;
	
	public WordDictionary() {
        root = new TrieNode<>();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode<Character> currentNode = root;
        for (int i = 0; i < word.length(); i++) {
        	char currentChar = word.charAt(i);
        	TrieNode<Character> childNode = currentNode.getChild(currentChar);
        	if (childNode == null) {
        		childNode = currentNode.addChild(currentChar);
        	}
        	currentNode = childNode;
        }
        currentNode.setEndOfWord(true);
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return dfsSearch(root, word, 0);
    }

	private boolean dfsSearch(TrieNode<Character> currentNode, String word, int index) {
		if (index == word.length()) {
			return currentNode.isEndOfWord();
		}
		char currentChar = word.charAt(index);
		TrieNode<Character> childNode = currentNode.getChild(currentChar); 
		if (childNode != null) {
			return dfsSearch(childNode, word, index+1);
		} else if (currentChar == '.') {
			boolean result = false;
			for (Map.Entry<Character, TrieNode<Character>> child: currentNode.getChildren().entrySet()) {
				if (index == word.length() && child.getValue().isEndOfWord()) {
					return true;
				}
				if (dfsSearch(child.getValue(), word, index+1)) {
					result = true;
				}
			}
			return result;
		}
		return false;
	}
}

