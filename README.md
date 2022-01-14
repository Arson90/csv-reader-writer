# CSV-Reader-Writer

## Description
Writing a CSV file, reading a CSV file and writing data from CSV to txt file in Java using OpenCSV.
Additionally, the program counts the sum and average data.

## Introducing 
### Step by step
1. This method is responsible for writing some example data to a CSV file.
* First we create an instance of CSVWriter by passing FileWriter object as a parameter and example file name as s parameter.
* Adding examples values and saving to salaries.scv file.
* Default Separated Value is a comma → CSVWriter.DEFAULT_SEPARATOR

![writingCSV](https://user-images.githubusercontent.com/37801354/149526910-16bf457b-1e3c-46fc-8276-e641440a6cd5.jpg)

2. This method is responsible for reading data from the salaries.csv file.
* After reading the data the count method is called by passing data as a parameter.

![readingCSV](https://user-images.githubusercontent.com/37801354/149528560-0854203a-caed-44f7-8277-c25099f0923f.jpg)

3. This method is responsible for counting a sum and an average values from the salaries.csv file.
* First we count a sum and an average row by row.
* After counting, the displayResults is called by passing two parameters.

![count](https://user-images.githubusercontent.com/37801354/149528641-c5652674-4abc-476c-8c47-4835ad67b88b.jpg)

4. This method is responsible for displaying data in console in specific format.
* After processing the data, the writingTXTFile method is called by passing rows as a parameter. 

![displayResult](https://user-images.githubusercontent.com/37801354/149528656-c3267d2f-c167-4c41-ad8a-46b4b769c672.jpg)

5. This method is responsible for writing data from salaries.csv to salariesStatistics.txt.
* First we create an instance of FileWriter by passing file name as a parameter.
* Saving data to to salariesStatistics.txt

![writingTXT](https://user-images.githubusercontent.com/37801354/149528666-8ba91bcc-f23b-4b52-baba-62242ea824df.jpg)
 
## Prerequisite
* Install IntelliJ IDEA
* Install JDK (Java Development Kit)
* OpenCSV → is a CSV parser library for Java. Dependency responsible for this library was added to pom.xml file.

![maven](https://user-images.githubusercontent.com/37801354/149524016-519d8a16-0edb-42d2-852d-48574f323358.JPG)
## Installing Tools
### Windows
* Download and install IntelliJ IDEA (community version is free)
* Download and install JDK
* Set the JDK path on Windows
### Linux
Follow this link to see the instruction about installing necessery tools on Linux
### Running Examples
* Download the zip or clone the Git repository
* Unzip the zip file to you projects directory
* Open IntelliJ
	* File → Open → Navigate to the folder where you unzipped the zip
  * Select the right project
* If you want to clone the repository you need to:
* Copy the project link
* Open IntelliJ
	* File → New → Project from Version Control
  * Paste the link and click Clone
* Right Click on the file and Run as Java Application

## Useful links
* IntelliJ IDEA → https://www.jetbrains.com/idea/download/#section=windows
* JDK → https://www.oracle.com/java/technologies/downloads/ or https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot
* Export an IntelliJ IDEA project to Eclipse → https://www.jetbrains.com/help/idea/exporting-an-intellij-idea-project-to-eclipse.html
* How to set JDK path on Windows → https://www.poftut.com/how-to-set-java-jre-and-jdk-home-path-and-environment-variables-on-windows/
