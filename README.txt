README


Teddy Kitchen's Caesar Cipher Project

1. Project Overview
2. Class Overview



1. Project Overview

In this project, I implement a Caesar Cipher in Java.  A description of all the code is in the next section and in javadoc format alongside the code for more detail.  This project contains a runnable .jar file in the dist folder, or can also be run in a development environment like Netbeans or Eclipse (I used Netbeans).  It is also possible to run this project in terminal (assuming your operating system has such a thing) although you may have trouble because of files that Netbeans puts in the project automatically.  If you have any trouble running it, please let me know at kitchenteddy@gmail.com.



2. Class Overview

CipherClient.Java - This is the main class of this program.  All it does is create a CipherUserInterface object and has it run its program in an infinite loop.


Cipher.Java - This file provides an interface for classes that implement encryption.  That is to say, classes that have both an encode and decode String method.

CaesarCipher.Java - This class, which implements the Cipher Interface, allows users to encrypt or decrypt strings using a Caesar Cipher shift.  When you create an instance of this class, you assign a shift integer to it, which determines how the text is shifted to be encrypted or decrypted.  This class can handle any int vale for shift and can shift backwards or more than one time through the alphabet.  This is the Model of this project, and should not be doing any user interface work.

Constants.Java - This class is provided mainly to avoid magic numbers, but also to provide potential support for different types of text encoding and/or different alphabets.  From here we reference things like the ASCII maximum value of an uppercase letter (90), or the length of the alphabet we are using (26).

CipherUserInterface.Java - This is a program that I wrote in order to showcase the CaesarCipher class and its Cipher interface.  This user interface program allows a user to enter in an integer shift, a string of text and get back a variety of information such as, the string encoded with that shift, the string decoded with that shift, etc.  Note that this program only makes use of our CaesarCipher through the Cipher interface, so we could easily implement other classes to encrypt our text with so long as they implement the Cipher interface.



