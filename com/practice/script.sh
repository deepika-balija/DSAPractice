#!/bin/bash
 
get_mem(){
	MemoryUsage=$(free | grep Mem)
	total_mem=$(echo $MemoryUsage | awk '{print $2}')
	used_mem=$(echo $MemoryUsage | awk '{print $3}')
	free_mem=$(echo $MemoryUsage | awk '{print $4}')

	used_percent=$((used_mem * 100 / total_mem))
	free_percent=$((free_mem * 100 / total_mem))

	echo " MemoryUsage : $used_percent% used, $free_percent% free" >> out_puttest.log
}

while true; do
	get_mem
done


