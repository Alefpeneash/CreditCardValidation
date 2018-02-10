This program is needed to identify the type of card and validate its number using the Luhn algorithm.

**Required software**:
+java 1.8 openjdk
+Apache Ant 1.9.6
+External libraries: (do not require downloading, already in the lib catalog)
 -junit-4.12.jar
  -hamcrest-core-1.3.jar

**Instructions for use**:

1. In to start the program, you need to run this command in build folder:
  '''bash
  java -jar CreditCardValidation.jar <your number>
  '''
  example:
  '''bash
  java -jar CreditCardValidation.jar 4276550033998892
  '''
2. To rebuild program, you need to run:
  '''bash
  ant build
  '''

2. To run program, you need to run:
  '''bash
  ant test
  '''
  and then you can see the logs by path: build/tRes/TEST-classes.testcard.TestCard.txt
