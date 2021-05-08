# CE204.HW
This simple program solves a question that states.

"You are given a file called “std” and composed of “Number, Name, Address” fields.
(You can define the type of fields by yourself) Write an algorithm that makes “insert,
delete, update and retrieve”, processes on the records in the file. The “Number” field is the
key of each record."

The idea is to use a hashtable to store the data in the form of <key, value>, where the key is an integer and the value is a class named stu.
The class will store the name and the address of a student.

Also, a text file will be created and updated every time the program gets executed to unsure correct data.
Note that the path of the text file in the program should be changed depending on your environment.

The code was written assuming that the user will cooperate, which is impossible in reality.
You write something wrong, the program will break. Didn't have time to handle this stuff.
