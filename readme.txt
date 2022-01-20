Run the file under com.tests
The project is developed in ubuntu machine hence need to tweak if needs to be run on windows machine
Chromedriver.exe needs to be downloaded and placed in a directory
Replace with below command in Line Number 12
System.setProperty("webdriver.chrome.driver","path to chromedriver.exe");
teleDocTests.java is executable, open the file--> Right Click --> Run AS TestNG Suite
OR
Run testNG.xml , open the file--> Right Click --> Run AS TestNG Suite