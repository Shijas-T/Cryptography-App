# Cryptography-App
Java Android project


Encryption : The process of changing a given text or message to an encoded format using any encryption 
algorithm so that it cannot be read normally and can only be accessed by an authorized user.

Decryption : The process of converting the encoded or encrypted message back to its original form. 
In some algorithms applying the same method can decrypt the encoded message to its original form.

Plaintext : The original message which needs to be sent to the end user. It may or may not be formatted.

Ciphertext : The resulting message formed when an encryption algorithm is applied on the plaintext.
Shift : Integer between zero and twenty-five which can tell us how many shifts will be applied on a character.


Encryption of a letter x by a shift n can be described mathematically as,

(x)=(x+n)\mod {26}.}E_{n}(x)=(x+n)\mod {26}.

Decryption is performed similarly,

(x)=(x-n)\mod {26}.}D_{n}(x)=(x-n)\mod {26}.


Example :-
Plaintext:  THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
Ciphertext: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD
