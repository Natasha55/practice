#!/bin/bash

# if you want to start -> please write: /.print_biggest.sh nums.txt
# Sort the numbers and use the last number
max=$(sort -n $1 | tail -n 1)
echo "The Biggest number in file $1 is $max"

