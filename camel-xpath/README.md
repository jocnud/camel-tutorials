What are we doing ?

We are using XPATH to read XML files and depending upon
the content of the file we will calling PROCESSOR methods
to do the stuffs we want to do.

Example file used is /data/xmlfolder/person.xml


1. We will read this file by polling to folder using Apache Camel

2. Once we get the file using XPATH we will go to the node we want to filter upon
   and get its content.
   

3. Then using Apache Camel we will switch it to different PROCESSORS. 



