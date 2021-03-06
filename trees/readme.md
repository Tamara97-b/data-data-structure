# Trees
## code challange 15
* A Tree is a non-linear data structure where data objects are organized in terms of hierarchical relationship.
Important Terminology in trees
* Node - A Tree node is a component which may contain it’s own values, and references to other nodes
* Root - The root is the node at the beginning of the tree
* K - A number that specifies the maximum number of children any node may have in a k-ary tree. In a binary tree, k = 2.
* Left - A reference to one child node, in a binary tree
* Right - A reference to the other child node, in a binary tree
* Edge - The edge in a tree is the link between a parent and child node
* Leaf - A leaf is a node that does not have any children
* Height - The height of a tree is the number of edges from the root to the furthest leaf
* Approach & Efficiency
add() Time : O(n). Space : O(n). contains() Time : O(n) in the worst case. Space : O(1).

## Code Challenge 16
## description
Find the maximum value in a given tree.

## whiteboard :
![cc16](images/cc16.PNG)

## Approach & Efficiency :
In add method I used for loop to find the max value .this is good approch to be used. Time : O(n). Space : O(1).

## Code challange 17
## description
Write a function called breadth first Arguments: tree Return: list of all values in the tree, in the order they were encountered

## whiteboard :
![cc17](images/cc17.PNG)

## Approach & Efficiency :
O(1) fot time and space

## Code challange 18
## description 
Write a function called fizz buzz tree.
Arguments: k-ary tree
Return: new k-ary tree
Determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:
If the value is divisible by 3, replace the value with “Fizz”.
If the value is divisible by 5, replace the value with “Buzz”.
If the value is divisible by 3 and 5, replace the value with “FizzBuzz”.
If the value is not divisible by 3 or 5, simply turn the number into a String.

## Whiteboard Process
![cc18](images/cc18.PNG)

Approach & Efficiency
Space: O(n)
Time: O(n)


