class Trie {
    public Trie[] trie;
    public boolean flag;

    public Trie() {
        trie = new Trie[26];
        flag = false;
    }

    public void insert(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int ind = c - 'a';
            if (node.trie[ind] == null) {
                node.trie[ind] = new Trie();
            }
            node = node.trie[ind];
        }
        node.flag = true;
    }

    public boolean search(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            int ind = word.charAt(i) - 'a';
            if (node.trie[ind] == null) {
                return false;
            }
            node = node.trie[ind];
        }
        return node.flag;
    }

    public boolean startsWith(String prefix) {
        Trie node = this;
        for (int i = 0; i < prefix.length(); i++) {
            int ind = prefix.charAt(i) - 'a';
            if (node.trie[ind] == null) {
                return false;
            }
            node = node.trie[ind];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie* obj = new Trie();
 * obj->insert(word);
 * bool param_2 = obj->search(word);
 * bool param_3 = obj->startsWith(prefix);
 */