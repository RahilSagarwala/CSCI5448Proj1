# CSCI5448Proj1 - The Zoo
 Inheritance Animals
 
## Team Members
Brian Lim <br>
Kandai Watanabe <br>
Rahil Sagarwala <br>

## Development Assumptions
- Developed using Java 11
- The names of all the animals at the zoo should be unique
- Overriden behavior by various animals was developed by generating a different string to print than the default output.

## Development Issues
* Developing the output to be cross platform - our group noticed an issue between linux/windows in the newline vs. carriage returns in the unit tests. Java has a way to make the newline characters platform independent which allowed us to resolve that issue.

## Steps to Run Application
- Developed using Java 11
### IntelliJ
  - Import project into ide
  - Build the project
  - Run zoo.Zoo_Main
  
### Eclipse

### Command Line
Once code is built - execute the following command: <br>
```
java -classpath <path to repo>/CSCI5448Proj1/out/production/CSCI5448Proj1:<path to repo>/CSCI5448Proj1/out/production/CSCI5448Proj1/animals zoo.Zoo_Main
```
