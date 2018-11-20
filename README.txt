Chains of proteins

This program have been created for checking the possibility of creating chain of proteints (like "BDDFPQPPRRAGGHPOPDKJKPEQAAER") using only specific elemtents from another chain of proteins and also using only the same number of each elements which have been used in the chain which we use to compare with our chain.

At first , instead of inputing all chains by input devices (like keyboard or something else) I write code for opening txt file with name "Data.txt" if this file placed in such way "D:\\data.txt" .

Next I created the process of checking which we can divide into two steps .
Fisrt step is checking length of the chain , in case that their lengths aren't equal then it is not impossible to create our chain of proteins using chosen chain without breking our terms.
Second step is the checking by each elements in which we either if meet in both chains the same element change it into the element which will skip our loop or remove this element from both chains and continue our checking.
If this loop don't break and checked all elements in our chains without any problems then we can say that we are able to create our chain using chosen chain with the same elements and with the same number of each element.

The result of our checking i organized in such way.
In our console we receive such message:
"
/*Index number of pair*/ pair of proteins 
First chain - /*First chain of proteins*/
Second chain - /*Second chain of proteins*/
Chain /*First chain of proteins*/ /"could" or "couldn't"/ be created by using pair /*Second chain of proteins*/
Answer is /*Yes* or *No*/
" 

And we receive the chain of results in our console .



Important :

Programm is created in such way that it will check the string variables if it placed like one variable(chain) in one line .
Example:
BDDFPQPPRRAGGHPOPDKJKPEQAAER
BDDFPQPFRRAGGHPOPDKJKPEQAAER
So , if you want to change variables know that .

Also , before starting please check that you have file data.txt in such way "D:\\data.txt" , if you want to change this way or name of file you also need to change line 14 in our class .
File data.txt will be in the folder with project.