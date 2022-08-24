# Cryptography-App
Java Android project

In this android project you can enter a plaintext and it converts to ciphertext or you can enter the cipher text
and it will convert to plaintext

Cryptography is a method of protecting information and communications through the use of codes.
so that only those for whom the information is intended can read and process it.

PROBLEM STATEMENT 

Cryptography provides for secure communication in the presence of malicious third-parties—known as adversaries.
Encryption uses an algorithm and a key to transform an input (i.e., plaintext) into an encrypted output (i.e., ciphertext).

METHODOLOGY

Encryption : The process of changing a given text or message to an encoded format using any encryption algorithm 
so that it cannot be read normally and can only be accessed by an authorized user.

Decryption : The process of converting the encoded or encrypted message back to its original form. In some 
algorithms applying the same method can decrypt the encoded message to its original form.

Plaintext : The original message which needs to be sent to the end user. It may or may not be formatted.

Ciphertext : The resulting message formed when an encryption algorithm is applied on the plaintext.

Shift : Integer between zero and twenty-five which can tell us how many shifts will be applied on a character.

IMPLEMENTATION

Encryption Technique used here is The Caesar Cipher technique which is one of the earliest and simplest methods
of encryption technique. It’s simply a type of substitution cipher, i.e., each letter of a given text is replaced
by a letter with a fixed number of positions down the alphabet

Examples : 
Text : ABCDEFGHIJKLMNOPQRSTUVWXYZ

Shift: 23

Cipher: XYZABCDEFGHIJKLMNOPQRSTUVW

Text : ATTACKATONCE

Shift: 4

Cipher: EXXEGOEXSRGI

ENCRYPTION

In encryption a given message will be transformed into another formatted message. To use the Caesar cipher technique, 
a shift will be given to us, which will be applied to encrypt our message.

DECRYPTION

Now we will process the cipher message which is encrypted by Caesar cipher to break it down to its original message form. 
There will be a shiftKey given, using which we can shift each character back to get the original message

Cipher(n) = De-cipher(26-n)


