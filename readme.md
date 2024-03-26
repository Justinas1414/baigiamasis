## Automation tests for [1a ("Vienas_a")](https://www.1a.lt/)

#### Link to the page - https://www.1a.lt/

## Technologies:

* JAVA/Maven

#### Packages used:

* testNg
* Selenium
* Webdriver manager

## Test cases:

### **1. Sing Up (UserSingUpTest)**

* open registration web page https://www.1a.lt/users/sign_up;
* click on accept cokkies;
* input First Name: John;
* input Last Name: Wick;
* input Email: sileikajustinas@yahoo.com;
* input password: Justas123456789*;
* input repeat password: Justas123456789*;
* click on button "Registruotis" to proceed with the registration process;

* >Expected: new window has emerged displaying a prompt requesting account approval via email.

### **2. Sing In (UserSingInTest)**

* open registration web page https://www.1a.lt/users/sign_up;
* click on accept cokkies;
* input Email: sileikajustinas@yahoo.com;
* input password: Justas123456789*;
* click on button "Prisijungti" to proceed with the Sing In;

* >Expected: a new window is launched, displaying a user interface where the name "John" is prominently featured
on the right-hand side, accompanied by a profile icon.

### **3. Add Contact Detail in Customers Account (AddContactDetailsTest)**

* Sing In to account;
* click on Profile Icon on the top righ with users name "John";
* click on "Pridėti naują kontaktinę informaciją";
* input First Name: John;
* input Last Name: Wick;
* input number: 69465972;
* click on city drop down meniu;
* input city "Vilnius";
* click on suggested city "Vilnius";
* input address: Antakalnio g. 59;
* input postal code: 10207;
* click on "Saugoti";

* >Expected: under "Kontaktinė informacija" customer First Name and Last Name will appear,
with number and address, postal code.

### **4. Add item to cart (AddToCartItemTest)**

* Sing In to account;
* Input item in search box: "irklai";
* Click on suggested item form list: "Irklas Bestway 65307, 167 - 217 cm";
* Click on button "Į Krepselį;

* >Expected: a windown will appear with message: "Prekė sėkmingai įdėta į pirkinių krepšelį".

### **5. Item purchase (ItemPurchaseTest)**

* Sing In to account;
* Add item to cart;
* click on button: "Peržiūrėti pirkinių krepšelį";
* double click "+", add additional two units to cart;
* click on button: "Pradėti pirkimą"
* click on radio button: "Atsiėmimas klientų aptarnavimo centre";
* click on radio button: "Pristatyti nurodytu adresu;


* >Expected: after selecting "Pristatyti nurodytu adresu", user is able to click button "Tęsti", to complete his 
  > purchase via selected bank.

### **6. Users account deletion (UserAccountDeletionTest)**

* Sing In to account;
* click on profile icon on the top right with users name "John";
* click on button: "Trinti Paskyrą";
* click "Ok" on alerted message;
* input Email: sileikajustinas@yahoo.com in the alert;
* click "Ok" on alerted message;

* >Expected: users account is deleted and a new window is opened, without users name "John", but with "Prisijungti".

    
    
    


    



    
    

    




    
    

    