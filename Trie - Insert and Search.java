// Problem Link:-  

//Function to insert string into TRIE.
static void insert(TrieNode root, String key) 
{
    // Your code here
    TrieNode node = root;
    for(int i=0; i<key.length(); i++){
        char ch = key.charAt(i);
        if(node.children[ch-'a'] == null){
            node.children[ch-'a'] = new TrieNode();
        }
        node = node.children[ch-'a'];
    }
    node.isEndOfWord=true;
}

//Function to use TRIE data structure and search the given string.
static boolean search(TrieNode root, String key)
{
    // Your code here
    TrieNode node = root;
    for(int i=0; i<key.length(); i++){
        char ch = key.charAt(i);
        if(node.children[ch-'a'] == null){
            return false;
        }
        node = node.children[ch-'a'];
    }
    return node.isEndOfWord;
}
