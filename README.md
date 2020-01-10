# TP 4A SQR 2019-20: enigma
Code for the German Enigma machine used in WW2.

## Questions
- Fork this github repository
- Run the project
- Comment the 2 classes
- Complete the next section : functions to be tested
- Commit your changes (commit README.md)
- Make tests (call your test functions using the rule: GIVEN_WHEN_THEN) 
- Commit your changes
- On github, make a pull request 
- that ends

## Functions to be tested
Hereafter, for each classes give function to be tested 

### Classe Machine
#### functions
public String convert(String msg)
This method is already tested with the validation test already created in the MachineTest class. 

char convertChar(char c)
This method could be tested but it's too long to test. 

void advanceRotors()

### Classe Reflector
#### function
Not going to test the Reflector's rotorFactory() method cause the code which is contained inside is part of the parent class's rotorFactory() method. So, I am going to test the Rotor's rotorFactory() method in 2 parts, the first one which is the part contained in the parent's and child's method.


### Classe Rotor
#### function
public static Rotor rotorFactory(String str, String notches)
public void advance()
public int convertForward(int p)
public int convertBackward(int p)


## Tricks & tips

- Never test auto generate code
- Never test creator (its a design problem)
- Use @Test before each testFunction !
- When you test a void function of the class Rotor, then test the rotor instance's state
> Rotor r=new Rotor();
> int actual = r.getosition();
- You can test a function than throws an exception with the argument: expected
> @Test(expected=Exception.class)

## Documentation and validation set
### How simulate Enigma machine:
- https://korben.info/enigma-le-simulateur.html
- https://observablehq.com/@tmcw/enigma-machine
### Configuration code :
- * B III IV I AXLE
- FROM his shoulder Hiawatha / HYIHL BKOML IUYDC MPPSF SZW
- Took the camera of rosewood / SQCNJ EXNUO JYRZE KTCNB DGU



 