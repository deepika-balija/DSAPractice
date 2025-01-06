#!/bin/bash
echo "Enter the single digit number:  " 
read count
if ! [[ "$count" =~ ^[0-9]+$ ]]; then
	    echo "Please enter a valid number."
	        exit 1
fi


while [ $count  -le  5 ]; do
	echo "count the number is $count"
	((count++))
done

