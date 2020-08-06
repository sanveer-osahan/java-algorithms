package datastructure.trie;

import org.testng.Assert;
import org.testng.annotations.Test;

import datastructure.trie.Trie;
import util.ConversionUtil;

public class WordDictionaryTest {

	@Test
	public void testSearch() {
		WordDictionary wordDictionary = new WordDictionary();
		wordDictionary.addWord("abcd");
		Assert.assertTrue(wordDictionary.search("a.c."));
		Assert.assertFalse(wordDictionary.search("a.b."));
	}

	@Test
	public void testPrefix() {
		Trie<Character> trie = new Trie<>();
		trie.add(ConversionUtil.convertStringToList("abcd"));
		Assert.assertTrue(trie.startsWith(ConversionUtil.convertStringToList("ab")));
		Assert.assertFalse(trie.startsWith(ConversionUtil.convertStringToList("abd")));
	}
}
