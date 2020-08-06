package datastructure.trie;

import org.testng.Assert;
import org.testng.annotations.Test;

import datastructure.trie.Trie;
import util.ConversionUtil;

public class TrieTest {

	@Test
	public void testSearch() {
		Trie<Character> trie = new Trie<>();
		trie.add(ConversionUtil.convertStringToList("abcd"));
		Assert.assertTrue(trie.contains(ConversionUtil.convertStringToList("abcd")));
		Assert.assertFalse(trie.contains(ConversionUtil.convertStringToList("xyz")));
	}

	@Test
	public void testPrefix() {
		Trie<Character> trie = new Trie<>();
		trie.add(ConversionUtil.convertStringToList("abcd"));
		Assert.assertTrue(trie.startsWith(ConversionUtil.convertStringToList("ab")));
		Assert.assertFalse(trie.startsWith(ConversionUtil.convertStringToList("abd")));
	}
}
