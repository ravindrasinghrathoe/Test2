set projectLocation=D:\TestWs\AutomationFrameWork
cd%projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\LIB\*
java org.testng.TestNG %projectLocation%\testng.xml