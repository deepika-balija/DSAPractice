#!/bin/bash
echo "Enter your age:"
read age
if [ $age -lt 18 ]; then 
	echo "You are minor"
else
	echo "You are major"

fi
