class Trie {

    static class TrieNode{
        char val;
        boolean isEnd;
        TrieNode[] children = new TrieNode[26];
        TrieNode(){};
        TrieNode(char c){
            this.val = c;
            TrieNode node = new TrieNode();
        }
    }

    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
        root.val = ' ';
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        word = word.toLowerCase();
        TrieNode crawler = root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i)-'a';
            if(crawler.children[index]==null){
                crawler.children[index] = new TrieNode(word.charAt(i));
            }
            crawler = crawler.children[index];
        }
        crawler.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        word = word.toLowerCase();
        TrieNode crawler = root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i)-'a';
            if(crawler.children[index]==null){
                return false;
            }
            crawler = crawler.children[index];
        }
        return (crawler.isEnd);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        prefix = prefix.toLowerCase();
        TrieNode crawler = root;
        for(int i=0;i<prefix.length();i++){
            int index = prefix.charAt(i)-'a';
            if(crawler.children[index]==null){
                return false;
            }
            crawler = crawler.children[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
