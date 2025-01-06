#!/bin/bash

get_mem(){
	        # Extract memory usage using 'free' command
		        MemoryUsage=$(free | grep Mem)

			        # Extract values for total, used, and free memory in KB
				        total_mem=$(echo $MemoryUsage | awk '{print $2}')
					        used_mem=$(echo $MemoryUsage | awk '{print $3}')
						        free_mem=$(echo $MemoryUsage | awk '{print $4}')

							        # Calculate percentage of used and free memory
								        used_percent=$((used_mem * 100 / total_mem))
									        free_percent=$((free_mem * 100 / total_mem))

										        # Output the memory usage information
											        echo "MemoryUsage: $used_percent% used, $free_percent% free"
											}

											# Infinite loop to continuously monitor memory usage
											while true; do
												        get_mem
													        sleep 1  # Optional: sleep for 1 second before checking again
													done

