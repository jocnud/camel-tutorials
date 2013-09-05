What are we doing ?

We are using XPATH to read XML files and depending upon
the content of the file we will calling PROCESSOR methods
to do the stuffs we want to do.

Example : person.xml
-------------------------------------------------------
<person>
	<name>Shahbaz Khan</name>
	<age>25</age>
	<profession>
	<type>Good</type>
	<name>Doctor</name>
	</profession>
</person> 

-------------------------------------------------------

1. We will read this file by polling to folder using Apache Camel
2. Once we get the file using path we will go to the node we want to filter upon
   (In this case it will be <name> of <profession>)
3. Then using Apache Camel we will switch it to different PROCESSORS. 



