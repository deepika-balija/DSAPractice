#!/bin/bash
greet () {
	        echo "Hello, $name!"
	}


echo " Enter your name:"
read name

if [ -n "$name" ]; then
	name=$(echo "$name" | tr 'a-z' 'A-Z')
	greet
elif [ -z "$name" ]; then
	echo "Name is empty!"
else 
	echo "Please check your script"

fi

