# 236.-Lowest-Common-Ancestor-of-a-Binary-Tree

### **Problem Statement: Lowest Common Ancestor (LCA) in a General Binary Tree**  

#### **Problem Description:**  
Given a **binary tree** and two nodes, find the **Lowest Common Ancestor (LCA)** of the two given nodes. The LCA of two nodes is defined as the lowest (deepest) node in the tree that has both nodes as descendants (where we allow a node to be a descendant of itself).

#### **Input:**  
- A **binary tree** with `N` nodes.  
- Two given nodes `p` and `q` in the tree.  

#### **Output:**  
- Return the **Lowest Common Ancestor (LCA)** of the two given nodes.  

#### **Constraints:**  
1. The given tree is a **general binary tree** (not necessarily a binary search tree).  
2. The two given nodes always **exist in the tree**.  
3. The tree follows the structure where each node has **at most two children**.  

#### **Example 1:**  
##### **Input:**  
```
        3
       / \
      5   1
     / \  / \
    6   2 0  8
       / \
      7   4
```
Nodes: `p = 5`, `q = 4`

##### **Output:**  
```
5
```

##### **Explanation:**  
The **Lowest Common Ancestor (LCA)** of nodes **5** and **4** is **5** because **5** is the lowest node in the tree that has **4** as a descendant.

---

#### **Example 2:**  
##### **Input:**  
```
        3
       / \
      5   1
     / \  / \
    6   2 0  8
       / \
      7   4
```
Nodes: `p = 6`, `q = 4`

##### **Output:**  
```
5
```

##### **Explanation:**  
The **Lowest Common Ancestor (LCA)** of nodes **6** and **4** is **5** because **5** is the lowest node in the tree that has both **6** and **4** as descendants.

---

#### **Example 3:**  
##### **Input:**  
```
        3
       / \
      5   1
     / \  / \
    6   2 0  8
       / \
      7   4
```
Nodes: `p = 7`, `q = 8`

##### **Output:**  
```
3
```

##### **Explanation:**  
The **Lowest Common Ancestor (LCA)** of nodes **7** and **8** is **3** because **3** is the lowest node in the tree that has both **7** and **8** as descendants.

---

#### **Expected Time Complexity:**  
- **O(N)**, where `N` is the number of nodes in the tree.  

#### **Expected Space Complexity:**  
- **O(H)**, where `H` is the height of the tree (for recursion stack space).  
