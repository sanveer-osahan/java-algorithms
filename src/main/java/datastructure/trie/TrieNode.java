package datastructure.trie;

import java.util.HashMap;
import java.util.Map;

class TrieNode<E> {
	Map<E, TrieNode<E>> children;
	boolean endOfWord;
	
	TrieNode() {
		children = new HashMap<>();
		endOfWord = false;
	}
	
	TrieNode<E> addChild(E child) {
		children.putIfAbsent(child, new TrieNode<>());
		return getChild(child);
	}
	
	TrieNode<E> getChild(E child) {
		return children.get(child);
	}

	public Map<E, TrieNode<E>> getChildren() {
		return children;
	}

	public void setChildren(Map<E, TrieNode<E>> children) {
		this.children = children;
	}

	boolean isEndOfWord() {
		return endOfWord;
	}

	void setEndOfWord(boolean endOfWord) {
		this.endOfWord = endOfWord;
	}
}
